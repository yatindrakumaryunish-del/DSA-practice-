package CollectionFramework;

import Basics.Table;

import java.util.HashMap;
import java.util.Map;

//Map Interface in collection framework
//characterstic
// No Duplicate keys ,key value association,implemenmtation(Hash map , Tree map ,LinkedHashmape,Hash Table) ,order,Null value
public class Hashmap {
    static void main(String[] args) {

        Map<String,String> mapping = new HashMap<>();
        //Insertion
        mapping.put("in" , "India");
       // mapping.put("in" , "India2");//Value update ho jayega
        mapping.put("en" , "England");
        mapping.put("us" , "United States");
        System.out.println(mapping);
        Map<String,String> table = new HashMap<>();

        table.put("Br" , "Brajil");
        System.out.println("Before: "+table);
        table.putAll(mapping);//isse sare ek saath aajayenge bhai
        System.out.println("After: "+table);
        //deletion
        table.remove("en");
        System.out.println(table);
        table.size();
        System.out.println(table.size());//ye v method exist kr rha hai
       // table.clear();//clear meathod
        System.out.println(table);
        System.out.println(table.size());
        //isabsent key
        table.putIfAbsent("is" , "India3");//key value ko change krke india3 rakha jaa skta hai
        System.out.println(table);
        //get
        System.out.println(table.get("Br"));
        //getordefault(k,defaultValue)
        System.out.println(table.getOrDefault("us" ,"None"));//agar mile to prionmt kro warna nhi kro
        //agar nhi rahta to
        System.out.println(table.getOrDefault("ue" ,"None"));//nhi hai to none print krega
        //element present hai ya nhi
        System.out.println(table.containsKey("in"));//present hai to true
        System.out.println(table.containsKey("ir"));//present nhi hai to false
        System.out.println(table.containsValue("United States"));
        System.out.println(table.containsValue("United states od america"));
        //some athr meathods
        System.out.println(table);
        table.replace("in" , "Indonesia");//kisi v key value ko modifie krne ke liye use kr sakte hai
        System.out.println(table);
        //key set
       table.keySet();
        System.out.println(table.keySet());
        System.out.println(table.values());
        //get alll the entry from map
        System.out.println(table.entrySet());






    }
}
