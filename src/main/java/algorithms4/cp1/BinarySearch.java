package algorithms4.cp1;

/**
 * 二分查找算法
 *
 * @author qpzm7903
 * @since 2021-10-17-18:53
 */
public class BinarySearch {

    public static int binarySearch(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
