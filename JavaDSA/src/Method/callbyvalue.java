package Method;

public class callbyvalue {
   static void solve(int num){
       System.out.println("inside solve:-"+num);
       num = num*5 ;
       System.out.println("inside solve:-"+num);

    }

    static void main(String[] args) {
        int num = 5 ;
        System.out.println("inside solve:-"+num);
        solve(num);
        System.out.println("inside solve:-"+num);
    }
}
