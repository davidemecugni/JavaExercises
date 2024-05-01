package collections;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.sqrt;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n){
        Set<Integer> primes = new HashSet<>();
        for(int i = 2; i<= n; i++){
            primes.add(i);
        }
        for(int i=2;i<=sqrt(n);i++){
            primes.removeAll(multiples(i,n));
        }
        return primes;
    }

    private static Set<Integer> multiples(int n, int max){
        Set<Integer> multiples = new HashSet<>();
        for(int i=2;i*n<=max;i++){
            multiples.add(i*n);
        }
        return multiples;
    }
}
