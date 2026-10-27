package Method;
//meathod overloading
public class meathodOverloding {
    static int add(int a , int  b ){
        return a+b ;

    }
    static int add(int a , int b , int c ){
        return a+b+c ;
    }

    static void main(String[] args) {
        System.out.println(add(5 , 7));
        System.out.println(add(34,56,78));
    }
}
