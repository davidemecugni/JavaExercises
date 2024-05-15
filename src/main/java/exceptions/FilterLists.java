package exceptions;

import java.util.List;

public class FilterLists {
    public static List<List<String>> filterLists(List<List<String>> lists){
        List<List<String>> result = new java.util.ArrayList<>();
        for(List<String> list : lists){
            List<String> filteredList = FilterItems.filterItems(list);
            if(filteredList.size() == list.size()){
                result.add(filteredList);
            }
        }
        return result;
    }
}
