package String;
import java.util.Scanner;
public class palindrom {
    static String reversestring(String str){
        String reverse = "" ;
        int n = str.length();
        for(int i = n - 1 ; i >=0 ; i-- ){
            char ch = str.charAt(i);
            reverse = reverse + ch ;
        }
       return reverse ;
    }
    static boolean ispalindrom(String str){
        String original = str ;
        String reverse =reversestring(original);
        //compare
        for(int i = 0 ; i <original.length() ; i++){
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if(ch1!=ch2){
                //no match
                return  false ;
            }
        }
        return true ;
    }
    static void main(String[] args) {
        String str = "Lucky";
        System.out.println(ispalindrom(str));

    }
}
