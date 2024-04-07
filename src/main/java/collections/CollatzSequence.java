package collections;

import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {
    public static List<Long> collatzSequence(long n){
        List<Long> sequence = new ArrayList<>(List.of(n));
        if(n < 1){
            return new ArrayList<>();
        }
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            }
            else{
                n = 3 * n + 1;
            }
            sequence.add(n);
        }
        return sequence;
    }
}
