class LinkedList
{
    static Node segregate(Node head)
    {
        // add your code here
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        Node curr = head;
        while(curr!=null)
        {
            if(curr.data==0)
             cnt0++;
            else if(curr.data==1)
             cnt1++;
            else
             cnt2++;
            curr = curr.next;
        }
        curr = head;
        while(cnt0-->0)
        {
            curr.data = 0;
            curr = curr.next;
        }
        while(cnt1-->0)
        {
            curr.data = 1;
            curr = curr.next;
        }
        while(cnt2-->0)
        {
            curr.data = 2;
            curr = curr.next;
        }
        return head;
    }
}


