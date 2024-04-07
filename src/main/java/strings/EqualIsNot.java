package strings;

public class EqualIsNot {
    public static boolean equalIsNot(String string){
        return countMatches(string,"is") == countMatches(string,"not");
    }
    public static int countMatches(String text, String str){
        if(isEmpty(text) || isEmpty(str)){
            return 0;
        }
        int index = 0;
        int count = 0;
        while(true){
            index = text.indexOf(str, index);
            if(index != -1){
                count++;
                index += str.length();
            }
            else{
                break;
            }
        }
        return count;
    }
    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }
}
