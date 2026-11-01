package Arraysproblamsolving;

public class SumOfPositiveAndNegative {
    static int[] getpositivesum(int arr[]){
       int  positiveSum = 0 ;
        int negativesum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > 0){
                positiveSum = positiveSum+arr[i] ;

            }
            else{
                negativesum = negativesum+arr[i];
            }
        }
        int ans[] = {positiveSum , negativesum};
        return ans ;
    }
    static void main(String[] args) {
        int arr[] = {1,5,-6,-9};
      int ans [] = getpositivesum(arr);
        System.out.println("Positive sum = "+ans[0]);
        System.out.println("Negative sum = "+ans[1]);
}


}