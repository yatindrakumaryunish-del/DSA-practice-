package Pattern;

public class PyramidHolo {
    static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // for each row -> variable col
            //part 1
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //part 2
            if (i == 1 || i == n) {

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            }
            else
            {
                // middle row
                //1*

                System.out.print("*");
                //2r - 3 space
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                //1*
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

