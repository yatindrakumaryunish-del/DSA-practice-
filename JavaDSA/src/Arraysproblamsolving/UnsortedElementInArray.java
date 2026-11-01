package Arraysproblamsolving;

public class UnsortedElementInArray {
    static int getUnsortedElemengt(int arr[]){
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i+1] <= arr[i]){
                return arr[i+1];
            }
        }
        //jis case me loop se bahar aajaunga
        return -1 ;
    }

    static void main(String[] args) {
        int arr[] = {1,2,5,4,9};
        System.out.println(getUnsortedElemengt(arr));
    }
}
