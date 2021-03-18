package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;


public class rightView {
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> out = new ArrayList<>();
        Deque<Node> queue = new ArrayDeque<>();
        if (root == null)
            return out;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                root = queue.poll();
                if (i == size - 1)
                    out.add(root.data);
                if (root.left != null)
                    queue.offer(root.left);
                if (root.right != null)
                    queue.offer(root.right);
            }
        }
        return out;
    }
}
