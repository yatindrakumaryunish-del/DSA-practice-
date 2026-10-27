package Arrays;

import java.util.Scanner;

public class PracticeQuestion {
    static void main(String[] args) {
        int arr[] = new int[5];
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int multiply = 1 ;
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Enter the value "+i);
            arr[i] = sc.nextInt();
            int value = arr[i];
            sum = sum + value;
            multiply = multiply * value ;

        }
        System.out.println(sum);
        System.out.println(multiply);


    }

}
