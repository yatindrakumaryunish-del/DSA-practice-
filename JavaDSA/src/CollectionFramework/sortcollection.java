package CollectionFramework;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class sortcollection {
    static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
       list1.add(20);
       list1.add(23);
       list1.add(4);
       list1.add(1);
        System.out.println("Array elements are"+list1);
        //sort
        Collections.sort(list1);
        System.out.println(list1);
        //how wo sort in descending order
        Collections.sort(list1.reversed());
        System.out.println(list1);
        //clone()
        ArrayList<Integer> newlist = (ArrayList<Integer>)list1.clone();
        System.out.println(newlist);
        //ensure Capacity
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(list1.isEmpty());
        System.out.println(marks.isEmpty());
        System.out.println(list1.indexOf(20));
        System.out.println(list1.get(0));

    }
}
