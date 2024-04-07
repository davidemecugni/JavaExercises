package oop.reverse;

public class ReverserFast implements Reverser{
    @Override
    public String reverse(String s) {
        StringBuilder reversed;
        reversed = new StringBuilder(s);
        reversed.reverse();
        return reversed.toString();
    }
}
