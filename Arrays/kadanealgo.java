

import java.util.Scanner;

public class kadanealgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
         a[i] = sc.nextInt();
        
    }
    static int Kdaanealgo(int a[], int n)
    {
        int sum = 0, max_sum = 0;
        for(int i=0;i<n;i++) {
            sum += a[i];
            if(max_sum < sum )
             max_sum = sum;
            if(max_sum < 0)
             max_sum = 0;
        }
        return max_sum;
    }
}