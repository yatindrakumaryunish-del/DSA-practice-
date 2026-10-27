package Method;
import java.util.Scanner ;

public class HW3 {
    int num ;
    static boolean even(int num){

        if( num % 2 == 0){
            return true ;
        }
        else{
            return false ;
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num = sc.nextInt() ;
       boolean result = even(num);
        System.out.println(result);
    }
}
