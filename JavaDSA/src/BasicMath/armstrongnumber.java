package BasicMath;

public class armstrongnumber {
    static boolean isarmstrongnumber(int num) {
        int sum = 0;
        int originalnumber = num;
        while (num != 0) {
            int digit = num % 10;
            int cubeofDigit = digit * digit * digit;
            sum = sum + cubeofDigit;
            num = num / 10;
        }
        if (sum == originalnumber) {
            System.out.println("Number is armstrong");
            return true;
        } else {
            System.out.println("not an armstrong");
            return false;
        }

    }

    static void main(String[] args) {
        System.out.println(isarmstrongnumber(153));
    }

}
