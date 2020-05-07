package design;


import org.junit.Test;

import java.util.HashMap;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;

public class LFUCacheTest {

    @Test
    public void test1() {
        LFUCache cache = new LFUCache( 2 /* capacity (缓存容量) */ );

        cache.put(1, 1);
        cache.put(2, 2);
        assertThat(cache.get(1)).isEqualTo(1);       // 返回 1
        cache.put(3, 3);    // 去除 key 2
        assertThat(cache.get(2)).isEqualTo(-1);       // 返回 -1 (未找到key 2)
        assertThat(cache.get(3)).isEqualTo(3);       // 返回 3
        cache.put(4, 4);    // 去除 key 1
        assertThat(cache.get(1)).isEqualTo(-1);       // 返回 -1 (未找到 key 1)
        assertThat(cache.get(3)).isEqualTo(3);       // 返回 3
        assertThat(cache.get(4)).isEqualTo(4);       // 返回 4

    }


    @Test
    public void testTreeSet() {
        TreeSet<Node> nodes = new TreeSet<>((n1, n2) -> n1.frequency == n2.frequency ? -(n1.time - n2.time) : -(n1.frequency - n2.frequency));
        for (int i = 0; i < 10; i++) {

            Node node = new Node(i, i);
            node.frequency = i;
            nodes.add(node);
        }
        nodes.forEach(node -> System.out.println(node.frequency+ " " + node.time));

        System.out.println("add a node");
        Node node = new Node(10, 10);
        node.frequency = 9;
        node.time = 1;
        nodes.add(node);

        nodes.forEach(n -> System.out.println(n.frequency+ " " + n.time));

        System.out.println("change a node");
        node.frequency = 8;
        node.time = 1;

        nodes.forEach(n -> System.out.println(n.frequency+ " " + n.time));
        System.out.println("remove and add again");

        nodes.remove(node);
        nodes.add(node);

        nodes.forEach(n -> System.out.println(n.frequency+ " " + n.time));



    }
}