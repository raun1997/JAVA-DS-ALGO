package BST;



public class Search {
    boolean search(Node root, int x)
    {
        if(root==null)
            return false;
        while(root!=null)
        {
            if(root.data == x)
                return true;
            if(root.data<x)
                root = root.right;
            else
                root = root.left;
        }
        return false;
    }
}
