package collections;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second){
        Set<Integer> res = new HashSet<>(first);
        for(Integer i : second){
            if(!first.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
    public static Set<Integer> unionAddAll(Set<Integer> first, Set<Integer> second){
        Set<Integer> res = new HashSet<>(first);
        res.addAll(second);
        return res;
    }
}
