package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineNoDelegation {
    public static String readLineNoDelegation(String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            return br.readLine();
        }catch (Exception e){
            return null;
        }
    }
}
