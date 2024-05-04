package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapToPairs {
    public static <K, V> List<Pair<K, V>> mapToPairs(Map<K, V> src){
        List<Pair<K,V>> l = new ArrayList<>();
        for(Map.Entry<K,V> pair : src.entrySet()){
            l.add(new Pair<>(pair.getKey(), pair.getValue()));
        }
        return l;
    }
}
