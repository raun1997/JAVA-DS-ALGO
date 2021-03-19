package Tree;

import java.util.LinkedList;
import java.util.Queue;




public class maxwidth {
    int getMaxWidth(Node root)
    {
        // Your code here
        int max_level = 0;
        Queue<Node> queue = new LinkedList<>();
        if(root==null)
            return 0;
        queue.add(root);
        while(queue.isEmpty()==false)
        {
            int cnt = queue.size();
            max_level = Math.max(cnt, max_level);
            while(cnt-->0)
            {
                Node temp = queue.remove();
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
            }
        }
        return max_level;
    }
}
