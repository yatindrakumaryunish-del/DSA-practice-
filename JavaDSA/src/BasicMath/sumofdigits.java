package BasicMath;

public class sumofdigits {
    static int digitssum(int num){
        int sum = 0 ;
        while(num!=0){
            int digits = num % 10 ;
            sum = sum + digits ;
            num = num /10 ;

        }
        return sum ;
    }
    static void main(String[] args) {
int num = 987582346 ;
int sum = digitssum(num) ;
        System.out.println(sum);
    }
}
