package Method;

public class HW7 {
    static void updateValue(int x) {
        x = x + 10;
        System.out.println("Value inside meathod" + x);
    }

    static void main(String[] args) {
        int x = 20;
        System.out.println("befor call the meathod value be" + x);
        updateValue(x);
        System.out.println("After calling the meathod:-" + x);
    }

}
