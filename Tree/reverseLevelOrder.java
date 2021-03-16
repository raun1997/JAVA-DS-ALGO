package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class reverseLevelOrder {
    void reverseLevelOrder(Node node)  
    { 
        Stack<Node> S = new Stack(); 
        Queue<Node> Q = new LinkedList(); 
        Q.add(node); 
   
        // Do something like normal level order traversal order.Following 
        // are the differences with normal level order traversal 
        // 1) Instead of printing a node, we push the node to stack 
        // 2) Right subtree is visited before left subtree 
        while (Q.isEmpty() == false)  
        { 
            /* Dequeue node and make it root */
            node = Q.peek(); 
            Q.remove(); 
            S.push(node); 
   
            /* Enqueue right child */
            if (node.right != null) 
                // NOTE: RIGHT CHILD IS ENQUEUED BEFORE LEFT 
                Q.add(node.right);  
                  
            /* Enqueue left child */
            if (node.left != null) 
                Q.add(node.left); 
        } 
   
        // Now pop all items from stack one by one and print them 
        while (S.empty() == false)  
        { 
            node = S.peek(); 
            System.out.print(node.data + " "); 
            S.pop(); 
        } 
    } 
   
}
