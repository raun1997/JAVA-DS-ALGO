package Tree;

import java.util.ArrayList;



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
        
        if(max_level<level)
        {
            list.add(root.data);
            level = max_level;
        }

        leftViewofTree(list, root.left, level+1);
        leftViewofTree(list, root.right, level+1);
    }
}
