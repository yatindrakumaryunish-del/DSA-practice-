package Queue;
import java.util.ArrayDeque;
import java .util.Deque;
public class arraydequeimp {
    static void main(String[] args) {
        Deque<Integer> de = new ArrayDeque<>();
        de.offer(12);
        de.offer(43);
        de.offer(55);
        System.out.println(de);
        de.pollLast();
        System.out.println(de);
        de.pollFirst();
        System.out.println(de);
        System.out.println(de.size());
        System.out.println(de.peek());
        System.out.println(de.peekFirst());
        System.out.println(de.peekLast());
    }
}
