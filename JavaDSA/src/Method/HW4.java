package Method;
import java.util.Scanner ;
public class HW4 {

    static int getMaximum(int a , int b){
        if(a > b){
            return a ;
        }
        else{
           return b ;
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number a:-");
        int a = sc.nextInt();
        System.out.println("Enter a number b:-");
        int b = sc.nextInt();
       int max =  getMaximum(a , b);

        System.out.println(max);



    }
}
