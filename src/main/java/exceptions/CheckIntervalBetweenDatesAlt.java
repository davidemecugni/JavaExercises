package exceptions;

public class CheckIntervalBetweenDatesAlt {
    public static boolean checkIntervalBetweenDatesAlt(String begin, String end){
        try {
            return CheckIntervalBetweenDates.checkIntervalBetweenDates(begin, end);
        } catch (Exception e) {
            return false;
        }
    }
}
