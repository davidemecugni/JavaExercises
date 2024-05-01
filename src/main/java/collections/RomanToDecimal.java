package collections;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {
    public static int romanToDecimal(String s){
        if(s.isEmpty() || s.length() > 15){
            throw new IllegalArgumentException("Too short or too long");
        }
        Map<Character, Integer> charToNumber = new HashMap<>(Map.of(
                'I',1, 
                'V',5,
                'X',10,
                'L',50,
                'C',100,
                'D', 500,
                'M',1000
        ));
        Map<Character, Character> subtraction = new HashMap<>(Map.of(
                'V','I',
                'X','I',
                'L','X',
                'C','X',
                'D','C',
                'M','C'
        ));
        int res = 0;
        int prev = Integer.MAX_VALUE;
        for(Character c : s.toCharArray()){
            if(!charToNumber.containsKey(c)){
                throw new IllegalArgumentException("Unsupported char");
            }
            int current = charToNumber.get(c);
            if(prev < current){
                if(subtraction.get(c) == null || prev != charToNumber.get(subtraction.get(c))){
                    throw new IllegalArgumentException("Invalid roman number");
                }
                res -= 2*prev;
            }
            res += current;
            prev = current;
        }
        return res;
    }

}
