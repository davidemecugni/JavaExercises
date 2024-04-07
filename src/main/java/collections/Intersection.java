package collections;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
        Set<Integer> res = new HashSet<>();
        for(Integer i : second){
            if(first.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
    public static Set<Integer> intersectionRetainAll(Set<Integer> first, Set<Integer> second){
        Set<Integer> res = new HashSet<>(first);
        res.retainAll(second);
        return res;
    }
}
