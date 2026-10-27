package T2Darray;

public class Traversal {
    static void main(String[] args) {
        int arr[][];
        arr = new int[3][4];
        int brr[][] ={
                {1, 2, 3, 4},
                {2,3,4},
                {3,4,5,6},
                {5}
        } ;
        int n = brr.length ;
        for(int rowIndex = 0 ; rowIndex<=brr.length - 1 ;rowIndex++){
            for(int colIndex = 0 ;colIndex <= brr[rowIndex].length-1 ; colIndex++){
                System.out.print(brr[rowIndex][colIndex]+" ");
            }
            System.out.println();
        }


    }
}
