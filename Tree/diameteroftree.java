package Tree;

public class diameteroftree {
    int diameter(Node root) {
        if (root == null)
            return 0;
        int left = diameter(root.left);
        int right = diameter(root.right);
        int lleft = height(root.left);
        int lright = height(root.right);
        return Math.max(lright + lleft + 1, Math.max(left, right));
    }

    int height(Node root) {
        if (root == null)
            return 0;
        else
            return Math.max(height(root.left), height(root.right)) + 1;
    }
}
