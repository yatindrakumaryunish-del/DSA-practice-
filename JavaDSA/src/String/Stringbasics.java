package String;

import com.sun.security.jgss.GSSUtil;

public class Stringbasics {
    static void main(String[] args) {
        String s = "Lucky";

        String str = new String("lUcKy");
        System.out.println(s + " " + str);
        // System.out.println(s[0]);
        System.out.println(s.length());//length of string
        System.out.println(s.charAt(4));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        if (s.equals(str)) {
            System.out.println("Yes equals in term of each character");
        } else {
            System.out.println("Not equal");
        }
        if(s.equalsIgnoreCase(str))//when only charater are written in casesensitive
        {
            System.out.println("yes equal");

        }else{
            System.out.println("Not equal");
        }
    }
}
