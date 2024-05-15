package exceptions;

import java.util.ArrayList;
import java.util.List;

public class FilterItems {
    public static List<String> filterItems(List<String> strings){
        List<String> result = new ArrayList<>();
        for(String s : strings){
            try {
                CheckString.checkString(s);
                result.add(s);
            } catch (Exception e) {
                // do nothing
            }
        }
        return result;
    }
}
