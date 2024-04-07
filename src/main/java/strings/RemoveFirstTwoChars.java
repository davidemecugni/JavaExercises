package strings;

public class RemoveFirstTwoChars {
    public static String removeFirstTwoChars(String string){
        StringBuilder sb = new StringBuilder();
        for(int i=2; i<string.length();i++){
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }
}
