package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineCompleteDelegation {
    public static String readLineCompleteDelegation(String filename) throws IOException{
        String result;
        BufferedReader br = new BufferedReader(new FileReader(filename));
        result = br.readLine();
        return result;
    }
}
