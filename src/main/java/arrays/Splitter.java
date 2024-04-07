package arrays;

public class Splitter {
    public static int[] splitter(int input){
        String stringInput = String.valueOf(input);
        int length = stringInput.length();
        int[] a = new int[length];
        for(int i=0;i<length;i++){
            a[i] = Character.getNumericValue(stringInput.charAt(i));
        }
        return a;
    }
}
