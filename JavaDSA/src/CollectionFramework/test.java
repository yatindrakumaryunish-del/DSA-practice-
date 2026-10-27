package CollectionFramework;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class test {
    static void main(String[] args) {
        //List or collection-> interface
        //Array List-> concrete class
        ArrayList<Integer> list = new ArrayList<>();
        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);


        //add all
        List<Integer> list2 = new ArrayList<>();
        list2.add(102);
        list2.add(230);
        list.addAll(list2);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("Print list2:-"+list2);
       list2.clear();
        System.out.println(list2.size());
        System.out.println("print the list:-"+list2);
        //iterator
        //i wonat to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        //iterator ke pass method :- has next():-next element pr move krega
       List<Integer>List = new ArrayList<>();
       while(iterator.hasNext()){
           System.out.println("Element:-"+iterator.next());

       }
        //Collection<Integer> Collection = new ArrayList<>();
    }
}
