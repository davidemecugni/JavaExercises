package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Reverse {
    public static List<String> reverse(List<String> sentence){
        Deque<String> deque = new ArrayDeque<>(sentence);
        List<String> dst = new ArrayList<>();
        while(!deque.isEmpty()){
            dst.add(deque.removeLast());
        }
        return dst;
    }
}
