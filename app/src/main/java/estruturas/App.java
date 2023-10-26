package estruturas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {

    final char value;
    Map<Character, Node> children;

    public Node(char value) {
        this.value = value;
        this.children = new HashMap<>();
    }
}

class PrefixTree {
    private final Node root;
    private int size;

    public PrefixTree() {
        root = new Node('*');
        size = 0;
    }

    public boolean isEmpty() {
        return root.children.isEmpty();
    }

    public void add(String word) {
        Node n = root;

        for (char c : word.toCharArray()) {
            Node child = n.children.get(c);
            if (child == null) {
                child = new Node(c);
                n.children.put(c, child);
                size++;
            }
            n = child;
        }
    }

    public int size() {
        return size;
    }

}

public class App {
    public static void main(String[] args) {
        System.out.println("Árvore de prefixos");

        PrefixTree tree = new PrefixTree();

        System.out.println(tree.isEmpty());

    }
}
