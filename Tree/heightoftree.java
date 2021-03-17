package Tree;

public class heightoftree {
    int height(Node node) {

        if(node == null)
            return 0;
        else
            return Math.max(height(node.left), height(node.right))+1;
    }
}
