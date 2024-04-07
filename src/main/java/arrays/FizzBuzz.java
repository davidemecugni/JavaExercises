package arrays;


public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end){
        String[] out = new String[end-start];
        int n = start;
        for(int i = 0; i < end-start; i++){
            n = start + i;
            if(n%3==0 && n%5==0){
                out[i] = "FizzBuzz";
            }
            else if(n%3==0){
                out[i] = "Fizz";
            }
            else if(n%5==0){
                out[i] = "Buzz";
            }
            else{
                out[i] = Integer.toString(n);
            }
        }
        return out;
    }
}
