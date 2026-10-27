package JavaVector;

import java.util.Vector;

public class vEctor {
    static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(23);
        list.add(43);
        list.add(54);
        System.out.println("Elements are :-"+list);
        list.remove(2);
        System.out.println(list);
        //all meathods are available

    }
}
