package strings;

public class SumDigits {
    public static int sumDigits(String string){
        int count = 0;
        for(char c:string.toCharArray()){
            if(Character.isDigit(c)){
                count += Character.getNumericValue(c);
            }
        }
        return count;
    }
}
