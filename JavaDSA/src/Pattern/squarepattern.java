package Pattern;

public class squarepattern {
    static void main(String[] args) {
        for(int i = 1 ; i <=4 ; i++)// for each ro
             {
            for(int j = 1 ; j<=4 ; j++)//for each column
            {
                //star
                System.out.print("  *");
            }
            //Move to next row
            System.out.println();
        }

    }
}
