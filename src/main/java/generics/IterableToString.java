package generics;

public class IterableToString {
    public static <E> String iterableToString(Iterable<E> src){
        StringBuilder res = new StringBuilder();
        for(E element: src){
            res.append(element.toString()).append(", ");
        }
        return res.toString();
    }
}
