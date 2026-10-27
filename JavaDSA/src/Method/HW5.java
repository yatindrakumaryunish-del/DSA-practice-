package Method;

import java.util.Scanner;

public class HW5 {
    static float calculatePercentage(int obtained, int total) {
        float precentage = (obtained * 100.0f) / total;
        return precentage;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter obtained marks:-");
        int obtained = sc.nextInt();
        System.out.println("Enter total marks:-");
        int total = sc.nextInt();
        float precentage = calculatePercentage(obtained, total);
        System.out.println(precentage);
    }
}
