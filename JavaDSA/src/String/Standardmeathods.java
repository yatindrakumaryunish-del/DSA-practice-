package String;

import java.sql.SQLOutput;

public class Standardmeathods {
    static void main(String[] args) {
        String str = "Yatindra";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        String name = "YATINDRA";
        System.out.println(str.equals(name));
        System.out.println(str.equalsIgnoreCase(name));
        //empty -> length = 0 ;
        //blank->empty or sirf space hai string
        String ptr = "  ";
        System.out.println(ptr.length());
        System.out.println(ptr.isEmpty());
        System.out.println(str.isEmpty());
        System.out.println(ptr.isBlank());
        String stre = " Yatindra    ";
        System.out.println(stre.length());
        stre = stre.trim();//for remove the leading and trailng space
        System.out.println(stre.length());
        //lower case and upper case
        String ing = "LUCKY";
        String ring = "Himmat";
        System.out.println(ing.toLowerCase());
        System.out.println(ring.toUpperCase());
        //part nikalna hai substring se
        String tring = "My name is Yatindra kumar yunish";
        //0 -> M
        //1-> y
        //2 -> space ans so on
        //beginIndex  ->  3  -> inclusive//ye count hoga
        //endIndex -> 6 -> exclusive//ye print me count nhi hoga
        System.out.println(tring.substring(3, 7));
        // string ke andar ye word present hai ya nhi

        System.out.println(tring.contains("Yatindra"));
        System.out.println(tring.contains("lover "));
        //data ko string me convert krna chahe to
        int num = 5321;
        String string = String.valueOf(num);
        System.out.println(num + 1);//yanha addition hoga
        System.out.println(string + 12);//yanha alag se wo word rite hoga yani concatination
        //word start aur end kisse krta hai
        String obj = " lucky love singh";
        System.out.println(obj.startsWith(" lucky"));
        System.out.println(obj.startsWith("love "));
        System.out.println(obj.endsWith("singh"));
        System.out.println(obj.endsWith("Singh"));
        // convert string to character array
        String ram = "Babbar";
        char[] crr = name.toCharArray();
        //print tha charaxter array
        for (char ch : crr) {
            System.out.println("Value of char:-" + ch);
        }
        //split meathod
        String input = " My , name , is , lucky , singh";
        String[] words = input.split(",");
        for (String str1 : words) {
            System.out.println(str1);
        }
        String ramu = "Ramayan" ;
       ramu =  ramu.replace('a' , 'l');
        System.out.println(ramu);

    }
}
