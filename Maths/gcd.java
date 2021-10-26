public class gcd {
    public static void main(String[] args) {
        System.out.println(GCD(12, 15));
    }

    static int GCD(int a, int b) {
        if(b==0)
            return a;
        return GCD(b, b%a);
    } 
}
