public class Factorial {
    public static void main(String [] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    public static int factorial(int n) {
        int j = 1;
        for (int i = 1; i <= n; i++) {
            j *= i;
        }
        return j;
    }
}
