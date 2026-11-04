package Arraysproblamsolving;

//
//import java.util.HashMap;
//
public class ArrayMOde {
//    static int findmode(int arr[]) {
//        HashMap<Integer, Integer> freq = new HashMap<>();
//        for (int num : arr) {
//            freq.put(num, freq.getOrDefault(num, 0) + 1);
//        }

    /// /       for(int i: freq.keySet()){
    /// /           System.out.println(i+" ->"+ freq.get(i));
    /// /       }
//        int maxFreq = -1;
//        int maxFreqwalikey = -1;
//        for (int key : freq.keySet()) {
//            int currentKey = key;
//            int currentKeyFrequency = freq.get(key);
//            if (currentKeyFrequency > maxFreq) {
//                //mujhe naya max mil gya
//                maxFreq = currentKeyFrequency;
//                maxFreqwalikey = currentKey;
//            }
//        }
//        //jb loop se bahar aaoge max freq wali key redy rahegi wahi return krna hai
//        return maxFreqwalikey;
//    }
//    static void main(String[] args) {
//        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5};
//        // findmode(arr);
//        int ans = findmode(arr);
//        System.out.println(ans);
//    }
    // without hash map
    static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 4, 4, 6, 1, 1, 4, 3, 4, 4, 8, 7, 5};
        int mode = arr[0];
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        System.out.println("Mode->" + mode);
        System.out.println("Frequescy->" + maxCount);
    }
}
// without hash map
//complexity = O(n);
//spacecomplexity=O(1);
