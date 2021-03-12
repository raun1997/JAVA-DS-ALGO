package Hashing;

import java.util.HashMap;
import java.util.Scanner;



import java.util.Map;
public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
         a[i] = sc.nextInt();
        


        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            // to check whether element is not repeated
            if(!hmap.containsKey(a[i]))
            {
                hmap.put(a[i], 1);
            }
            else
            {
                // element repeated more than once
                int cnt = hmap.get(a[i]);
                hmap.put(a[i], cnt+1);
            }
        }
        // Traversing the HashMap
        for(Map.Entry m : hmap.entrySet())
        {
            Integer temp = (int)m.getValue();
        }
    }
}
