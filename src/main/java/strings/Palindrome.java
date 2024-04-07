package strings;

public class Palindrome {
    public static boolean isPalindrome(String string){
        if (string.isEmpty()) {
            return true;
        }
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
