package BasicMath;

public class ispalindrom {
    static int reverse(int num) {
        int revNum = 0;
        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;

        }
        return revNum;
    }

    static boolean ispalindrom(int num) {
        int originalNum = num;
        int reversedNum = reverse(num);
        if (originalNum == reversedNum) {
            System.out.println("It is a palindrom number");
            return true;
        } else {
            System.out.println("It is not a palindrom numbber");
            return false;
        }

    }

    static void main(String[] args) {
        boolean ans = ispalindrom(1221);
        System.out.println(ans);
    }
}
