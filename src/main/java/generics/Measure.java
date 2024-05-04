package generics;



public class Measure {

    public static <T> T max(T[] array, Measurer<T> measurer){
        T max = array[0];
        for(T element: array){
            if(measurer.measure(element) > measurer.measure(max)){
                max = element;
            }
        }
        return max;
    }
    public static <T> T min(T[] array, Measurer<T> measurer){
        T min = array[0];
        for(T element: array){
            if(measurer.measure(element) < measurer.measure(min)){
                min = element;
            }
        }
        return min;
    }

    public interface Measurer<T> {
        double measure(T item);
    }
}


