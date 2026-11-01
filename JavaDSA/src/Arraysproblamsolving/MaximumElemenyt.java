package Arraysproblamsolving;

import java.util.Arrays;

public class MaximumElemenyt {
    static int getmaximum(int arr []){
        int maxi = arr[0];
        for(int i = 0 ; i <arr.length;i++){
            if (arr[i]>maxi){
                maxi = arr[i];
            }
        }
        //jb yanha pahuchunga to pura array compare ho chuka hogha
        return maxi;
    }
    static void main(String[] args) {
        int [] arr = {1,4,7,2,9};
        System.out.println(getmaximum(arr));

    }
}
