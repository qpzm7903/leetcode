package backTracking;

/**
 * @author qpzm7903
 * @since 2020-03-08-16:54
 */

public class Pattern {
    private boolean matched = false;
    private char[] pattern;
    private int pLen;

    public Pattern(char[] pattern, int pLen) {
        this.pattern = pattern;
        this.pLen = pLen;
    }

    public boolean match(char[] text, int tLen) {
        matched = false;
        rMatch(0, 0, text, tLen);
        return matched;
    }

    private void rMatch(int ti, int pi, char[] text, int tLen) {
        if (matched) {
            return;
        }
        if (pi == pLen) {
            if (ti == tLen) {
                matched = true;
            }
            return;
        }
        if (pattern[pi] == '*') {
            for (int k = 0; k < tLen - ti; k++) {
                rMatch(ti + k, pi + 1, text, tLen);
            }
        }
        if (pattern[pi] == '?') {
            rMatch(ti, pi + 1, text, tLen);
            rMatch(ti + 1, pi + 1, text, tLen);
        } else if (ti < tLen && pattern[pi] == text[ti]) {
            rMatch(ti + 1, pi + 1, text, tLen);
        }
    }
}
