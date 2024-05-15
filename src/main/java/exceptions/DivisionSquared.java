package exceptions;

public class DivisionSquared {
    public static int divisionSquared(int a, int b){
        if(b == 0){
            return 0;
        }
        return (int) Math.pow(Division.division(a, b), 2);
    }
}
