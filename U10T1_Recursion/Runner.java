
public class Runner {
    public static void main(String[] args) {
        int n = 40; 
        long startTime = System.nanoTime();
        int fibRec = recursiveFib(n);
        long endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        startTime = System.nanoTime();
        int fibIter = iterativeFib(n);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;
        System.out.println("Fibonacci(" + n + ")");

        System.out.println("Recursive: " + fibRec+ " | Time: " + recursiveTime / 1e6 + " ms");
        System.out.println("Iterative: " + fibIter + " | Time: " + iterativeTime / 1e6 + " ms");
    }

    public static int iterativeFib(int n){
        if(n<2){
            return n;
        }
        int f1 = 0;
        int f2 = 1;

        for(int i = 0; i < n-1; i++){
            int t = f1 + f2;
            f1 = f2;
            f2 = t;
        }
        return f2;
    }

    public static int recursiveFib(int x){
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        // double recursive method call
        return recursiveFib(x - 1) + recursiveFib(x - 2);
    }
}
