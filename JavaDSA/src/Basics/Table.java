package Basics;
import java.util.Scanner ;
public class Table {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the value of n :-");
        int number  = sc.nextInt();
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(number+"*"+i +"="+(number *i) );
        }
    }
}
