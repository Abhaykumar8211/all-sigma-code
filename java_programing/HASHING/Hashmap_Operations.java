import java.util.*;

public class Hashmap_Operations {
    public static void main(String[] args) {
        //creat
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("us", 50);

        System.out.println(hm);

        // //Get - O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Indonesia"));  // print -> null

        // //ContainsKey - O(1)
        // System.out.println(hm.containsKey("India"));  // -> True
        // System.out.println(hm.containsKey("Indonesia")); // -> false


        //remove - O(1)
        System.out.println(hm.remove("china"));
        System.out.println(hm);


        //size
        System.out.println(hm.size());


        //Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());


    }
}
