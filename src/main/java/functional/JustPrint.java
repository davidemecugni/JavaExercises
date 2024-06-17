package functional;

import java.util.List;
import java.util.Map;

public class JustPrint {
    public static <T> void justPrintList(List<T> list){
        list.forEach(System.out::println);
    }
    public static <K,V> void justPrintMap(Map<K, V> map){
        map.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
