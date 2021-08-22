

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
        int size = arr.length;
        int maxsum = Integer.MIN_VALUE, sum = 0;
 
        for (int i = 0; i < size; i++)
        {
            sum = sum + arr[i];
            if (maxsum < sum)
                maxsum = sum;
            if (sum < 0)
                sum = 0;
        }
        return maxsum;
    }
}