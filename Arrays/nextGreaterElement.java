
import java.util.Stack;

public class nextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n) {
        Stack<Long> s = new Stack<>();
        long nge[] = new long[n]; // Unordered Map to store all the result
        for (int i = n - 1; i >= 0; i--) { // Run a loop in reverse order
            if (!s.empty()) {
                while (!s.empty() && s.peek() < arr[i]) { // If Peek element is less than curr element then it
                    s.pop(); // can't be the next greater element, so pop it.
                }
            }
            nge[i] = s.empty() ? -1 : s.peek(); // If some element exist in stack then the top element is next
            s.push(arr[i]); // greater element. Push the current element to stack.
        }
        return nge;
    }
}
