package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        //Input using for loop
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(Arrays.toString(arr));
        in.close();
    }
}
