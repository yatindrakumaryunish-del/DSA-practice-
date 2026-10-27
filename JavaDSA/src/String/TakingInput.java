package String;
import java.util.Scanner;
public class TakingInput {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the string :");
       String name = sc.nextLine();
        System.out.println("Value is :"+name);
        System.out.println("Enter the String without space");
        String word = sc.next();
        System.out.println("Value:"+word );



    }
}
