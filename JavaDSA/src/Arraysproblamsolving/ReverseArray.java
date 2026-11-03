package Arraysproblamsolving;

public class ReverseArray {
    static void reverse(int arr[]){
        int n = arr.length;
       int i = 0 ;
       int j = n-1 ;
        while(i <= j){
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            //i++
            i++;
            //j--
            j--;
        }
        //now the array will reversed
        //print
        for(int k: arr) {
            System.out.print(" "+k);
        }
    }
    static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,8};
        reverse(arr);

    }
}
