package collections;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {
    public static Set<Character> recurringChars(String string){
        Set<Character> seen = new HashSet<>();
        Set<Character> recurring = new HashSet<>();
        for(char c : string.toCharArray()){
            if(!seen.contains(c)){
                seen.add(c);
            }
            else{
                recurring.add(c);
            }
        }
        return recurring;
    }
}
