package Arraysproblamsolving;

public class LinearSearch {
    static boolean findTarget(int arr[],int target){
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        // agar pura array target hpo gya hai uske baad
        //v element nhi mila
        //iska matlab target is not present in the array
        //return false
        return false;
    }
    static void main(String[] args) {
        int arr[] = {2,4,7,10};
        boolean ans = findTarget(arr,9);
        System.out.println(ans);

    }
}
