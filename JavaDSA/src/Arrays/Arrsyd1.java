package Arrays;

public class Arrsyd1 {
    static void main(String[] args) {
        // decleration
        int arr[] ;
        //allocation
        arr = new int [5] ;
        int brr[] ={1,2,3};
        System.out.println(brr[0]+" is the value at zero index");
        System.out.println(brr[1]+" is the value at 1th index");
        System.out.println(brr[2]+" is the value at 2nd index");
        //for each loop
        int n = brr.length ;
        for(int index  = 0 ; index <= n-1 ; index ++){
            System.out.println(brr[index]);
        }
    }
}
