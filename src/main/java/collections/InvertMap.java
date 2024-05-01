package collections;

import java.util.Map;

public class InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> src){
        Map<String, Integer> res = new java.util.HashMap<>();
        for(Map.Entry<Integer, String> entry : src.entrySet()){
            res.put(entry.getValue(), entry.getKey());
        }
        return res;

    }
}
