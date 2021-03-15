package Tree;

import java.util.Scanner;

public class createTree {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        treeconstruct();
    }

    static Node treeconstruct() {
        Node root = null;
        System.out.println("Enter any number");
        int data = sc.nextInt();
        if (data == -1)
            return null;
        root = new Node(data);
        System.out.println("Enter data for left " + data);
        root.left = treeconstruct();
        System.out.println("Enter data for right " + data);
        root.right = treeconstruct();
        return root;
    }
}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}
