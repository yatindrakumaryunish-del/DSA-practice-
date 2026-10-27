package T2Darray;

public class maxValue {
    static void main(String[] args) {
        int arr[][] = {{1,2,3},{21,22,23}

        };
        int maxValue  = arr[0][0];
        for(int i = 0 ; i<=arr.length - 1 ;i++){
            for(int j = 0 ; j<=arr[i].length-1 ; j++){
                if(arr[i][j]>maxValue){
                    //update
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println(maxValue);
    }
}
