package Method;
public class Test {
    static void Greet() {
        System.out.println("Namaste Duniya");
    }
    static void printsum(int x , int y){
        System.out.println("Sum =" +(x + y));
    }
static void table(){
    for (int i = 1; i <= 10; i++) {
        System.out.println(2 * i);
    }
}
 static void printMultiplication(int a , int b){
        int ans  = a*b ;

   System.out.println("Result:" + ans);
}
// Non void
    static int add(int p , int q){
        int sum = p + q ;
        return sum ;
    }
    static void main(String[] args) {

        // call a meathod
        Greet();
        table();
        printsum(5 , 10);
        printMultiplication(5 , 10);
       int result =  add (3  , 4) ;
        System.out.println("Result:-"+result);
    }
}
