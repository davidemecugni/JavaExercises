package exceptions;

import java.time.LocalDate;

public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end){
        LocalDate beginDate = LocalDate.parse(begin);
        LocalDate endDate = LocalDate.parse(end);
        return beginDate.isBefore(endDate);
    }
}
