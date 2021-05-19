

import java.util.Scanner;
import java.util.Arrays;

// Longest consecutive subsequence
public class longestconsecutivesubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

    }

    static int longestconsecutiveSubsequence(int a[], int n) {
        Arrays.sort(a);
        int longeststreak = 1, currentstreak = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                if (a[i] == a[i - 1] + 1) {
                    currentstreak += 1;
                } else {
                    longeststreak = Math.max(longeststreak, currentstreak);
                    currentstreak = 1;
                }
            }
        }
        return Math.max(longeststreak, currentstreak);
    }
}
