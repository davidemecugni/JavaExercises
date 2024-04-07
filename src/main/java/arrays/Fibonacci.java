package arrays;

public class Fibonacci {
    public static long[] fibonacci(int n){
        if(n==1){
            return new long[]{1};
        }
        else if(n==2){
            return new long[]{1,1};
        }
        long[] out = new long[n];
        out[0] = 1;
        out[1] = 1;
        for(int i=2;i<n;i++) {
            out[i] = out[i - 1] + out[i - 2];
        }
        return out;
    }
}
