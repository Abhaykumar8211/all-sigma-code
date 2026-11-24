import java.util.*;

public class itineary_from_ticket {
    public static String getstart(HashMap<String, String> tickets) {
        HashMap<String, String> resMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            resMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!resMap.containsKey(key)) {
                return key; // sranting point
            }
        }

        return null;
    }

    public static void main(String args[]) {    //o(n)
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

        String start = getstart(tickets);
        System.out.print(start);

        for (String key : tickets.keySet()) {
            System.out.print("-->" + tickets.get(start));
            start = tickets.get(start);

        }
        System.out.println();
    }
}
