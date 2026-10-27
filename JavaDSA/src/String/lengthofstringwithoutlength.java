package String;

public class lengthofstringwithoutlength {
    static void main(String[] args) {
        String str = "LuckySingh";
        char[] arr = str.toCharArray();
        int count = 0;

        for (char ch : arr) {
            count++;
        }

        System.out.println("Length = " + count);

    }
}
