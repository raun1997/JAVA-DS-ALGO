import java.util.*;

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++) {
            pQueue.add(arr[i]);
            if(pQueue.size()>k)
                pQueue.poll();
        }
        return pQueue.peek();
    } 
}