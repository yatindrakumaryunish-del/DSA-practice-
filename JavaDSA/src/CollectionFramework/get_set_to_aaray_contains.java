package CollectionFramework;
import java.util.List ;
import java.util.ArrayList;
//use of get method
//use of set method
public class get_set_to_aaray_contains {
  public static void main(String[] args) {
        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13) ;
      System.out.println(list3.get(0));
      System.out.println("Before set:-"+list3);
      list3.set(0 , 120);
      System.out.println("after set"+list3);
      //convert collection to :-to Array
      Object[]arr = list3.toArray();
      for(Object obj: arr){
          System.out.println(obj);
          //contains method

      }
      System.out.println(list3.contains(120));
      System.out.println(list3.contains(122));
    }
}
