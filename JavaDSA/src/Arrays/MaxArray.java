package Arrays;

import java.util.Scanner;

public class MaxArray {
    static void main(String[] args) {
        int arr[] = new int[5];
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int max = arr[0];
        //Compare maxValue ko array k har element k sath
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Enter the value at :- " + i);
            arr[i] = sc.nextInt();

            if (arr[i] > max) {
                //update maximum value
                max = arr[i];

            }


        }
        System.out.println("Maximum of these is :-" + max);

    }
}
