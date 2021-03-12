package Hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
         a[i] = sc.nextInt();
        
         HashSet hset = new HashSet<>();
         for(int i=0;i<n;i++)
         {
             hset.add(a[i]);

             hset.contains(a[i]);

         }
         Iterator itr = hset.iterator();
         while(itr.hasNext())
         {
             int i = (int)itr.next();

         }
        
    }
}
