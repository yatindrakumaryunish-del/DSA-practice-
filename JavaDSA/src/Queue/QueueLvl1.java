package Queue;

import java.util.LinkedList;
import java.util.Queue;
public class QueueLvl1 {
    static void main(String[] args) {
//there are three meathods
        //1.Linked list implementation
        Queue<Integer> animal1 = new LinkedList<>();
        animal1.add(12) ;
        animal1.add(32) ;
        animal1.add(44) ;
        System.out.println("Default queue is :-"+animal1);
        //add use na kre exception handeling ka problam to Offer ka use kre
        animal1.offer(12) ;
        animal1.offer(23);
        animal1.offer(44) ;
        System.out.println(animal1);
        System.out.println( "Removed elemnt is:-"+animal1.poll());
        System.out.println(animal1);
        System.out.println("peeking element s:- "+animal1.peek());
        System.out.println(animal1);


    }
}
