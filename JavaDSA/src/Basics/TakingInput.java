package Basics;
import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:-");
       int firstnumber =  sc.nextInt();
        System.out.println("Enter the second number:-");
        int Secondnumber = sc.nextInt();
        int ans = firstnumber+Secondnumber;
        System.out.println("Answer is :- "+ans);
        BigInteger bg = sc.nextBigInteger();
        System.out.println("Biginteger:"+bg);
        System.out.println("Enter the  value for Flag:-");
        boolean flag = sc.nextBoolean();
        System.out.println("Enter the value for shortVal:-");
        short shortval = sc.nextShort();
        System.out.println("Enter the value for floatValue");
        float floatValue = sc.nextFloat();

        System.out.println("flag is:-"+flag);
        System.out.println("short value is :-"+shortval);
        System.out.println("Float value is :-"+floatValue);

        sc.close();
    }

}
