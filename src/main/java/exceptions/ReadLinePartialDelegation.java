package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLinePartialDelegation {
    public static String readLinePartialDelegation(String filename){
        String result;
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            result = br.readLine();
        }catch (IOException e){
            throw new RuntimeException("Couldn't read file");
        }
        return result;
    }
}
