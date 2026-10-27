package Arrays;

public class ForEachLoop {
    static void main(String[] args) {
      int arr[] ;
      arr = new int[5] ;
      int brr[] = {10,12,13,14,15};
      int n = brr.length ;
      for(int val : brr ){
          System.out.println(val);
      }
    }
}
