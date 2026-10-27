package BasicMath;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class HCFandLCM {

    static int getGCD(int a , int b){
    // gcd(a,b) =  gcd(b,a%b));
        while(b!=0){
            int oldvalueofb = b ;
            b = a%b ;
            a = oldvalueofb ;
        }
        //jab mera b 0 hoga tb a ki place pr gcd milega
        int ans = a ;
        return ans ;
    }
    static int getLCM(int a , int b){
        int gcd = getGCD(a,b);
        //gcd of (18 ,12) = 6
        int product = a*b ;
        //product(a,b) ->216
        int LCM = product/gcd ;
        //216/6
        return LCM ;
    }

    static void main(String[] args) {
        System.out.println(getGCD(18,12));
        System.out.println(getLCM(18 , 12));
    }

}
