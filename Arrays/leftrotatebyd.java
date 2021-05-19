public class leftrotatebyd {
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        rotate(arr, 0, d-1);
        rotate(arr, d, n-1);
        rotate(arr, 0, n-1);
    }
    static void rotate(int arr[], int i, int j)
    {
        while(i<j)
        {
            swap(arr[i], arr[j]);
            i++;
            j--;
        }
    }
    static void swap(int x, int y)
    {
        int temp = 0;
        temp = x;
        x = y;
        y = temp;
    }
}
