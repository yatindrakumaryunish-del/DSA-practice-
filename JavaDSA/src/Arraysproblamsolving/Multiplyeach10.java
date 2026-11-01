package Arraysproblamsolving;

public class Multiplyeach10 {
    static int[] getmultiplicatio(int arr[]){
       int size = arr.length;
       int newArray[] = new int [size];
       for(int i = 0; i<size;i++){
           int element = arr[i];
           int newElement = element*10 ;
           newArray[i] = newElement;
        }
       //return updated array
        return newArray;

    }

    static void main(String[] args) {
        int arr[] = {4,3,5,2};
        int ans[] = getmultiplicatio(arr);

        System.out.println("Printing answer array:-");
        for(int i : ans){
            System.out.println(i);
        }

    }

}
