package Arraysproblamsolving;

import java.util.HashMap;

public class HighestAndLowestFrequency {
    static int[] getLowestHighestFtreqelement(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        //Insert data
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        //Hash map is ready
        int highetFreq = Integer.MIN_VALUE;
        int highestFrenum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highetFreq) {
                highetFreq = currentFreq;
                highestFrenum = currentKey;
            }

        }
        int lowestfreq = Integer.MAX_VALUE;
        int lowestnum = -1;
        for (int key : freq.keySet()) {
            int currentkey = key;
            int currentfreq = freq.get(key);
            if (currentfreq < lowestfreq) {
                //its time to update
                lowestfreq = currentfreq;
                lowestnum = currentkey;
            }
        }
        int ans[] = {highestFrenum,lowestnum};
        return ans;
    }
    static void main(String[] args) {
        int arr[] = {2, 1, 3, 1, 3, 1, 4, 1, 4, 1, 4, 1};
        int ans[] = getLowestHighestFtreqelement(arr);
        System.out.println("Highest freq num " + ans[0]);
        System.out.println("Lowest freq num " + ans[1]);
    }

}
