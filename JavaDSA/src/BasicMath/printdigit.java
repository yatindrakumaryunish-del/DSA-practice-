package BasicMath;

public class printdigit {
    static void printdigit(int num) {


        //agar mere number =0 hai to mai ruk jaunga
        //agar number !=0 hai to mai processing krta rahunga
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            //last digit remove
            num = num / 10;
        }
    }

    static void main(String[] args) {
        int num = 53127;
        printdigit(num);
    }
}
