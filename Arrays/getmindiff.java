import java.util.*;

public class getmindiff {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int ans = arr[n-1]-arr[0], smallest = arr[0]+k, largest = arr[0]-k;
        int mi, ma;
        for(int i=0;i<n-1;i++) {
            mi = Math.min(smallest, arr[i+1]-k);
            ma = Math.max(largest, arr[i]+k);
            ans = Math.min(ans, ma-mi);
        }
        return ans;
    }
}
