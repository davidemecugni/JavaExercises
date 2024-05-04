package generics;

public class BinarySearch {
    public static <T extends Comparable<T>> int find(T[] array, T key){
        return findWithIndices(0, array.length, array, key);
    }

    private static <T extends Comparable<T>> int findWithIndices(int start, int stop, T[] array, T key){
        if(start == stop){
            return -1;
        }
        int middle = (start + stop) / 2;
        T middleValue = array[middle];
        if(middleValue.equals(key)){
            return middle;
        }
        else if(middleValue.compareTo(key) > 0){
            return findWithIndices(0, middle, array, key);
        }
        else{
            return findWithIndices(middle+1, stop, array, key);
        }
    }
}
