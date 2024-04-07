package arrays;

public class TenRun {
    public static int[] tenRun(int[] v){
        int[] out = new int[v.length];
        boolean multiple = false;
        int n = 0;
        for(int i=0;i<v.length;i++){
            if(v[i]%10==0){
                multiple = true;
                n = v[i];
            }
            out[i] = multiple ? n : v[i];
        }
        return out;
    }
}
