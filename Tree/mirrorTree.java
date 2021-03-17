package Tree;

public class mirrorTree {
    void mirror(Node node) {
        node = miror(node);
    }

    Node miror(Node node)
    {
        if(node==null)
            return null;
        Node left = miror(node.left);
        Node right = miror(node.right);

        node.left = right;
        node.right = left;
        return node;
    }
}
