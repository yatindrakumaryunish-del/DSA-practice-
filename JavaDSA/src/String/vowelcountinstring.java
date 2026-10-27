package String;

public class vowelcountinstring {
    static void main(String[] args) {
        String str = "Yatindrakumaryunish";

        int n = str.length();
        int count = 0 ;
        for(int i = 0 ; i< n ; i++){
            char ch = str.charAt(i);
            if(ch =='a'||ch =='e'||ch=='i'||ch=='o'||ch == 'u' ){
                count++;

        }
    }
        System.out.println(count);

}
}