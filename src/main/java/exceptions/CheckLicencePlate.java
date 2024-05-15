package exceptions;

public class CheckLicencePlate {
    public static void checkLicencePlate(String licence){
        if(!licence.matches("[A-Z]{2}\\d{3}[A-Z]{2}")){
            throw new IllegalArgumentException("Invalid licence plate");
        }
    }
}