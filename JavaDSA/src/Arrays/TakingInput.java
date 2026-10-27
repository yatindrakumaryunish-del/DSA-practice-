package Arrays;
import java.util.Scanner ;
public class TakingInput {
    static void main(String[] args) {

        int arr[] = new int[5] ;
        Scanner sc = new Scanner(System.in) ;
        int n = arr.length ;

        //input
        for(int i = 0 ; i <= n - 1 ; i++){
            System.out.println("Provid input for index " +i);
            arr[i] = sc.nextInt();

        }
//print
        System.out.println("Your array contain:-");
        for(int val : arr){
            System.out.println(val);
        }
    }
}
