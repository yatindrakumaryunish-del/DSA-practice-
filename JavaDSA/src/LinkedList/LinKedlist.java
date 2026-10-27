package LinkedList;
import java.util.LinkedList;
import java.util.Scanner ;

public class LinKedlist {
    static void main(String[] args) {
        LinkedList<Integer> Marks = new LinkedList<>();
        Marks.add(12);
        Marks.add(32);
        Marks.add(15);
        Marks.add(32);
        System.out.println(Marks);
        System.out.println(Marks.indexOf(15));
        //cloning cannot work in linked list as of Arraylist
        System.out.println(Marks.lastIndexOf(32));//becouse 32 ki last occurance index 3 pr hai

        //some framework
        //add first and add last
        Marks.add(33);
        Marks.add(39);
        Marks.add(44);
        System.out.println(Marks);
        Marks.addFirst(0);
        Marks.addLast(35);
        Marks.remove(2);
        Marks.remove(2);
        Marks.remove(2);
        Marks.remove(2);
        System.out.println(Marks);
        Marks.addFirst(12);
        System.out.println(Marks);
        Marks.poll();
        System.out.println(Marks);
    }
}
