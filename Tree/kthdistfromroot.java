package Tree;

import java.util.ArrayList;

public class kthdistfromroot {
    ArrayList<Integer> Kdistance(Node root, int k) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        calc(root, list, k, 0);
        return list;
    }

    void calc(Node root, ArrayList<Integer> list, int k, int a)
    {
        if(root!=null)
        {
            if(a==k && root!=null)
                list.add(root.data);
            
            calc(root.left, list, k, a+1);
            calc(root.right, list, k, a+1);
        }
    }
}
