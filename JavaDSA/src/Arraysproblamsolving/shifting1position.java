package Arraysproblamsolving;

public class shifting1position {
    static void shiftingthearray(int arr[]) {
        //step:1 store last wale ki value
        int n = arr.length;
        int temp = arr[n - 1];
        //step:2 shift all value of array
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }//step:3 temp ki value ko zero index pr copy kr dunga
        arr[0] = temp;
    }
    static void main(String[] args) {
        int arr[] = {45, 34, 76, 24, 65};
        shiftingthearray(arr);
        for (int a : arr) {
            System.out.print(a +" ");
        }
        System.out.println();
    }
}
