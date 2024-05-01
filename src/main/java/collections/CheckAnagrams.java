package collections;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {
    public static boolean areAnagrams(String first, String second){
        if (first.length() != second.length()) {
            return false;
        }
        return generateFrequencyMap(first).equals(generateFrequencyMap(second));
    }

    private static Map<Character, Integer> generateFrequencyMap(String input){
        Map<Character, Integer> res= new HashMap<>();
        for(Character c : input.toLowerCase().toCharArray()){
            res.computeIfPresent(c, (k,v) -> v+1);
            res.putIfAbsent(c, 1);
        }
        return res;
    }
}
