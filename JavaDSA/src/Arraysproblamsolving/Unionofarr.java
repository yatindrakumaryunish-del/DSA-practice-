package Arraysproblamsolving;

import java.util.HashSet;
import java.util.Set;

public class Unionofarr {

    // Function to return the union of two arrays as a Set of unique integers
    static Set<Integer> unionofArray(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();

        // Add all elements of the first array
        for (int num : arr1) {
            unionSet.add(num);
        }

        // Add all elements of the second array (duplicates are automatically ignored)
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