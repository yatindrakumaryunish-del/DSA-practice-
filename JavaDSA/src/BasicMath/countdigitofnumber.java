package BasicMath;

public class countdigitofnumber {
    static int countdigit(int num){
        int count  = 0 ;
        while(num!=0){
            int digit = num % 10 ;
            count++;
            num = num /10 ;
        }
        return count;
    }
    static void main(String[] args) {
      int num = 545317 ;
      int ans = countdigit(num);
        System.out.println(ans);
    }
}
