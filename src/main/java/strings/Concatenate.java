package strings;

public class Concatenate {
    public static String concatenate(String[] strings){
        StringBuilder sb = new StringBuilder();
        for(String string:strings){
            sb.append(string);
        }
        return sb.toString();
    }
}
