// Rain water Trapping Question done
import java.util.Scanner;
import java.util.Stack;

public class rainwatertrapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        for (int i = 0; i < n; i++)
            height[i] = sc.nextInt();
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && (height[stack.peek()]<height[i]))
            {
                int pop_height = height[stack.peek()];
                stack.pop();
                if(stack.isEmpty())
                 break;
                int distance = i - stack.peek() - 1;
                int min_distance = Math.min(height[stack.peek()], height[i]) - pop_height;
                ans += distance * min_distance;
            }
            stack.push(i);
        }
        sc.close();
        System.out.println(ans);
    }
}
