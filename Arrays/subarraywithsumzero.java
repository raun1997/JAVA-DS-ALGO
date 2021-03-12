package Arrays;

import java.util.HashSet;
// Subarray with 0 sum
import java.util.Scanner;

public class subarraywithsumzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        HashSet<Integer> hset = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum == 0 || hset.contains(sum) || a[i] == 0)
                System.out.println("True");
            hset.add(sum);
        }
    }
}
