package T2Darray;

public class sumof2darray {
    static void main(String[] args) {
        int arr[][] = {{1,2,3},{3,4,5}

        };
        int sum = 0;
        int multi  = 1 ;
        for(int i = 0 ; i<=arr.length-1;i++){
            for(int j = 0 ; j<=arr[i].length-1;j++){
                int value = arr[i][j];
                sum = sum+value;
              multi = multi * value ;

            }

        }
        System.out.println(sum);
        System.out.println(multi);
    }
}
