import java.util.*;

public class largestsubarray {
    public static void main(String args[]) {  // o(n)
        int arr[] = {15, -2, 2, -8, 1, 7, 10};

        HashMap<Integer, Integer> map = new HashMap<>();
        // (sum, key);

        int sum = 0;
        int len = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        System.out.println("largest subaaray with sum as 0 => " + len);
    }
}
