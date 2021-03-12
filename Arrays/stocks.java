package Arrays;

import java.util.Scanner;

// Best Time to Buy and Sell Stock

public class stocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
         a[i] = sc.nextInt();
         sc.close();
    }

    static int buyandsell(int a[], int n)
    {
        int min_so_far = a[0], max_profit = 0;
        for(int i=0;i<n;i++)
        {
            min_so_far = Math.min(min_so_far, a[i]);
            int profit = a[i] - min_so_far;
            max_profit = Math.max(max_profit, profit);
        }
        return max_profit;
    }
}