class Reverse {
    Node reverseList(Node head)
    {
        // code here
        Node curr = head, prev = null, next = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}