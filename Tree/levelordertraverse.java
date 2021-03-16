package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class levelordertraverse {

    // You are required to complete this method
    static ArrayList<Integer> levelOrder(Node node) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (queue.isEmpty() == false) {
            node = queue.peek();
            list.add(node.data);
            queue.poll();

            if (node.left != null)
                queue.add(node.left);

            if (node.right != null)
                queue.add(node.right);
        }
        return list;
    }
}
