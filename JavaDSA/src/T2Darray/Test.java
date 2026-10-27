package T2Darray;

public class Test {
    static void main(String[] args) {
        //Decleration
        int arr [][] ;
        //allocation
         arr = new int[3][4] ;
         //initiliazation
        int[][] brr = {
                {1,2},
                {2,3},
                {3,4},
                {5,6}
        };
        int n = brr.length ;
        int k  = brr[0].length ;
      //  System.out.println(brr[3][0]);
        //to print entire array
        for(int i  = 0 ; i <= n-1 ; i++){
            for(int j = 0 ; j <= k - 1 ; j++){
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
