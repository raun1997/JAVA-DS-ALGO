package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class leftview {
    int max_level = 0;
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        leftViewofTree(list, root, 1);
        return list;
    }

    void leftViewofTree(ArrayList<Integer> list, Node root, int level)
    {
        if(root==null)
            return ;
        
        if(level>=max_level)
        {
            list.add(root.data);
            level++;
        }

        leftViewofTree(list, root.left, level);
        leftViewofTree(list, root.right, level);
    }
}
