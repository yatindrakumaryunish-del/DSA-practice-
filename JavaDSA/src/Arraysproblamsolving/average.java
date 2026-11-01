package Arraysproblamsolving;

public class average {
    static double getAverage(int [] arr){
        int sum = 0 ;
        for(int i : arr){
            sum = sum + i ;

        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }
    static void main(String[] args) {
       int  arr[] = {2,4,3,3};
        System.out.println(getAverage(arr));


    }
}