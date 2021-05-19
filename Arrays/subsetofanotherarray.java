

import java.util.HashSet;
import java.util.Scanner;



// Find whether an array is subset of another array
public class subsetofanotherarray {
    public static boolean main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a1[] = new int[n];
        for (int i = 0; i < n; i++)
            a1[i] = sc.nextInt();
        int a2[] = new int[m];
        for (int i = 0; i < m; i++)
            a2[i] = sc.nextInt();
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!hset.contains(a1[i]))
             hset.add(a1[i]);
        }
        for(int i=0;i<m;i++)
        {
            if(!hset.contains(a2[i]))
             return false;
        }
        return true;
    }
}
