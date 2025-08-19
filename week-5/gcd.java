

public class gcd {
    // eculidean algorithm to find GCD
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }       
    
}
