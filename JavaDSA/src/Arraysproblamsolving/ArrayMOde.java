package Arraysproblamsolving;

import java.util.HashMap;

public class ArrayMOde {
    static void findmode(int arr[]){
       HashMap<Integer,Integer> freq = new HashMap<>();
       for(int num:arr){
           freq.put(num,freq.getOrDefault(num,0)+1);



        }
       for(int i: freq.keySet()){
           System.out.println(i+" :-"+ freq.get(i));
       }
    }

    static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,4,5,5,5,5,5};
        findmode(arr);
    }
}
