package LinkedList.Single;

import java.util.Scanner;

public class createList {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        createlist();
      
    }
    static Node createlist()
    {
        Node root = null;
        System.out.println("Enter data");
        int data = sc.nextInt();
        root = new Node(data);
        if(data == -1)
         return null;
        
        System.out.println("Enter data for next "+data+" node");
        root.next = createlist();
        return root;

    }
    
}



class Node {
    Node next;
    int data;
    public Node(int data)
    {
        this.data = data;
    }
}