package BST;

public class Deletion {
    public static Node deleteNode(Node root, int X) {
        // code here.
        if (root == null)
            return root;
        if (root.data > X)
            root.left = deleteNode(root.left, X);
        else if (root.data < X)
            root.right = deleteNode(root.right, X);
        else {
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;
            else {
                Node succ = getSucc(root);
                root.data = succ.data;
                root.right = deleteNode(root.right, succ.data);
            }
        }
        return root;
    }

    Node getSucc(Node root) {
        Node curr = root.right;
        while (curr != null && curr.left != null)
            curr = curr.left;
        return curr;
    }
}
