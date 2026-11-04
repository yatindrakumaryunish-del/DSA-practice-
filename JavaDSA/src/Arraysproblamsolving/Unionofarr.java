package Arraysproblamsolving;

import java.util.HashSet;
import java.util.Set;

public class Unionofarr {


    static Set<Integer> unionofArray(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();

        for (int num : arr1) {
            unionSet.add(num);
        }

        for (int num : arr2) {
            unionSet.add(num);
        }

        return unionSet;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 4, 6, 5, 7};

        Set<Integer> ans = unionofArray(arr1, arr2);

        System.out.println("Union of arrays: " + ans);
    }
}