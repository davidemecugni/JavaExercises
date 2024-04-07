package strings;

public class DuplicateChars {
    public static char[] duplicateChars(String string){
        StringBuilder seen = new StringBuilder();
        StringBuilder recurring = new StringBuilder();
        for(int i=0; i<string.length(); i++){
            String tmp = String.valueOf(string.charAt(i));
            if(!seen.toString().contains(tmp)){
                seen.append(tmp);
            }
            else if(!recurring.toString().contains(tmp)){
                recurring.append(tmp);
            }
        }
        char[] out = recurring.toString().toCharArray();
        java.util.Arrays.sort(out);
        return out;
    }
}
