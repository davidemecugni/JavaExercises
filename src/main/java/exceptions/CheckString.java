package exceptions;

import java.text.ParseException;

public class CheckString {
    public static void checkString(String s) throws ParseException {
        if(!s.matches("([a-zA-Z][0-9])+")){
            throw new ParseException("Invalid string", 0);
        }
    }
}
