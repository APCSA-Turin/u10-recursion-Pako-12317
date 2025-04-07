
public class fibonacci {
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
