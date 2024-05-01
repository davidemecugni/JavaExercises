package arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;
public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise){
        double[] dst = new double[size];
        Arrays.fill(dst, value);
        if(addNoise){
            RandomGenerator generator = RandomGenerator.getDefault();
            for(int i=0;i<dst.length;i++){
                dst[i] += generator.nextDouble(0.1 * value) - 0.05*value;
            }
        }
        return dst;
    }
}
