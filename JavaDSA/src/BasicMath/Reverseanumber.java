package BasicMath;

public class Reverseanumber {
    static int reverse(int num) {

        int revNum = 0;
        //ans = ans * 10 + current digit
        while (num != 0) {
            int digit = num % 10;
            //reverse num calculate as per formula
            revNum = revNum * 10 + digit;
            //last digit remove krna padega num me se
            num = num / 10;

        }
        return revNum;
    }

    static void main(String[] args) {
        int num = 12345;
        int revNum = reverse(num);
        System.out.println(revNum);
    }
}
