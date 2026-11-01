package Arraysproblamsolving;
//count the number of zeros and ones

public class zerosandones {
    static int[] getzerocount(int arr[]) {
        int zeroCount = 0;
        int OnesCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else {
                OnesCount++;

            }
        }
        int ans[] = {zeroCount, OnesCount};
        return ans;


    }

    static void main(String[] args) {
        int arr[] = {1,1,0,1,0,1,0,1,1,1,0};
        int ans[] = getzerocount(arr);
        System.out.println("zero count :-"+ans[0]);
        System.out.println("Ones count :-"+ans[1]);
    }
}