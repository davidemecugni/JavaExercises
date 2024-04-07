package arrays;

public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v){
        int[] out = new int[v.length];
        int i, nonzero = 0;
        for(i = 0; i < v.length; i++){
            if(v[i] != 0){
                out[nonzero++] = v[i];
            }
        }
        return out;
    }
}
