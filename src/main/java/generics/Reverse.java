package generics;

import java.util.List;

public class Reverse {
    public static <T> void reverse(List<T> list){
        for (int i = 0; i < (double) (list.size() / 2); i++) {
            T temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
    }
}
