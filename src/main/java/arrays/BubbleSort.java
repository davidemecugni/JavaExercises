package arrays;

public class BubbleSort {
    public static void bubbleSort(int[] v){
        boolean changed = true;
        while(changed){
            changed = false;
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i+1]) {
                    int temp = v[i];
                    v[i] = v[i+1];
                    v[i+1] = temp;
                    changed = true;
                }
            }
        }
    }
    public static int[] bubbleSortCopy(int[] v){
        int[] copy = new int[v.length];
        System.arraycopy(v,0,copy,0,v.length);
        bubbleSort(copy);
        return copy;
    }
}
