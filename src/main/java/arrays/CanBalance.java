package arrays;

import java.util.Arrays;

public class CanBalance {
    public static boolean canBalance(int[] v){
        if (v.length < 2) {
            return false;
        }
        int sum = Arrays.stream(v).sum(), partial_sum = 0;
        if(sum % 2 == 1){
            return false;
        }
        sum /= 2;
        for (int j : v) {
            partial_sum += j;
            if (partial_sum == sum) {
                return true;
            } else if (partial_sum > sum) {
                return false;
            }
        }
        return false;
    }
}
