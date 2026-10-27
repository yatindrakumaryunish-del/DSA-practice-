package Loops;
import java.util.Scanner;
public class HW1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the value of n :-");
        n = sc.nextInt();
        for (int i = 1 ; i<=n;i++){
            System.out.println(i);
        }
    }
}
