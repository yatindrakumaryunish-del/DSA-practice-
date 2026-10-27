package Arrays;
import java.util.Scanner ;
public class minimuminsideArray {
    static void main(String[] args) {


        int arr[] = new int[5];
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        //index o pr input
       // System.out.println("enter the value at index o");
       // arr[0] = sc.nextInt();
        int min = arr[0];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter the value of array at index:- "+i);
            arr[i] = sc.nextInt();
            if(i == 0){
                min = arr[i] ;
            }
            if(arr[i] < min){
                min = arr[i] ;
            }

        }
        System.out.println(min);
    }
}
