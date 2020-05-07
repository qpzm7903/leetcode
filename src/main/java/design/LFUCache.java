package design;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * @author qpzm7903
 * @since 2020-04-05-10:28
 */

public class LFUCache {
    int time;
    int size;
    int capacity;
    HashMap<Integer, Node> hashMap;
    TreeSet<Node> treeSet;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        size = 0;
        time = 0;
        hashMap = new HashMap<>();
        treeSet = new TreeSet<>((n1, n2) -> n1.frequency == n2.frequency ? -(n1.time - n2.time) : -(n1.frequency - n2.frequency));
    }

    public int get(int key) {
        if (capacity == 0) {
            return -1;
        }
        Node node = hashMap.get(key);
        if (node == null) {
            return -1;
        }
        time++;
        treeSet.remove(node);
        node.frequency++;
        node.time = time;
        treeSet.add(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }
        time++;
        if (hashMap.containsKey(key)) {
            Node node = hashMap.get(key);
            treeSet.remove(node);

            node.value = value;
            node.frequency++;
            node.time = time;
            treeSet.add(node);

        } else {
            if (capacity == size) {
                Node node = treeSet.pollLast();
                hashMap.remove(node.key);
                size--;
            }
            Node newNode = new Node(key, value);
            newNode.frequency = 1;
            newNode.time = time;
            hashMap.put(key, newNode);
            treeSet.add(newNode);
            size++;
        }
    }

}

class Node {
    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        frequency = 1;
    }

    int frequency;
    int time;
    int key;
    int value;
}
