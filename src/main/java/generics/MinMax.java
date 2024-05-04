package generics;

import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static <T> T max(List<T> list, Comparator<? super T> cmp){
        T max = list.getFirst();
        for(T element : list){
            if(cmp.compare(element,max) > 0){
                max = element;
            }
        }
        return max;
    }
    public static <T> T min(List<T> list, Comparator<? super T> cmp){
        T min = list.getFirst();
        for(T element : list){
            if(cmp.compare(element,min) < 0){
                min = element;
            }
        }
        return min;
    }
}
