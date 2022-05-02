public class Main {
    public static void main(String[] args) {
        // Example
        Node node = new Node(4);
        node.appendToEnd(5);
        node.appendToEnd(6);
        node.appendToEnd(7);
        node.appendToEnd(8);
        node.appendToEnd(9);
        node.appendToEnd(10);
        node.appendToEnd(11);
        node.appendToEnd(12);
        node.appendToEnd(13);
        node.appendToEnd(14);
        node.appendToEnd(15);

        node = node.deleteNode(node,11);
        node.printNodes();
    }
}
