package Array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,24,567,363,90};
        swap(arr, 1,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
