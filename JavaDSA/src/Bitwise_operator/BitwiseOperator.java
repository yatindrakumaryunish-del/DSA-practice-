package Bitwise_operator;

public class BitwiseOperator {
    static void main(String[] args) {
//        int a = 5 ;
//        int b = 6;
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a ^ b);
//        System.out.println(~a);

        int n = 5 ;
        for(int i = 1 ; i<=32;i++){
            n = n << 1 ;
            System.out.println(n);
            System.out.println();
        }

    }

}
