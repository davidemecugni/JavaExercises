package arrays;

public class DivideArray {
    public static double[] divideArray(double[] v, double factor) {
        double[] out = new double[v.length];
        System.arraycopy(v, 0, out, 0, v.length);
        for (int i = 0; i < out.length; i++) {
            out[i] = v[i] / factor;
        }
        return out;
    }
}
