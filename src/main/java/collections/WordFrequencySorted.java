package collections;

import java.util.*;

public class WordFrequencySorted {

    public static Map<String, Integer> sortAndCut(Map<String, Integer> map, Comparator<Map.Entry<String, Integer>> comparator, int limit){
        List<Map.Entry<String, Integer>> limited = new ArrayList<>(map.entrySet());
        limited.sort(comparator);
        limited = new ArrayList<>(limited.subList(0, limit));
        Map<String, Integer> res = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry : limited){
            res.put(entry.getKey(), entry.getValue());
        }
        return res;
    }
    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit){
        return sortAndCut(map, (v1, v2) -> v2.getValue() - v1.getValue(), limit);
    }
    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit){
        return sortAndCut(map, Comparator.comparingInt(Map.Entry::getValue), limit);
    }
}
