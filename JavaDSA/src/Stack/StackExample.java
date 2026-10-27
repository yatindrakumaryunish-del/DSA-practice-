package Stack;

import java.util.Stack;

public class StackExample {
    static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.add(13);
        list.push(32) ;
        list.push(43) ;
        list.push(55) ;
        list.push(47) ;
        System.out.println("Stack created Successfully and the list are:-"+list);
        list.pop();
        System.out.println(list);
    }
}
