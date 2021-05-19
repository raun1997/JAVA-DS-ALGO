
// Sort an array of 0s, 1s and 2s without using any sort algo
import java.util.Scanner;

public class sortingwithoutsortalgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        sc.close();
        int cnt0 = 0, cnt1 = 0, cnt2 = 0, i;
        for (i = 0; i < n; i++) {
            if (a[i] == 0)
                ++cnt0;
            else if (a[i] == 1)
                ++cnt1;
            else
                ++cnt2;
        }
        i = 0;
        while (cnt0-- > 0) {
            a[i] = 0;
            ++i;
        }
        while (cnt1-- > 0) {
            a[i] = 1;
            ++i;
        }
        while (cnt2-- > 0) {
            a[i] = 2;
            ++i;
        }
    }
}
