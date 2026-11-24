import java.util.*;


public class TreeMapDemo {
    public static void main(String args[]) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put( "india", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("indonesiya", 200);

        

        
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);
        
        System.out.println(hm);
        System.out.println(tm);
    }
}
