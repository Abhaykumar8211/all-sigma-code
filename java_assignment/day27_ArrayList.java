// import java.util.ArrayList;

// public class day27_ArrayList {
//     public static boolean isisotomic(ArrayList<Integer>nums){
//         boolean inc = true;
//         boolean dec = true;

//         for(int i=0; i<nums.size()-1; i++){
//             if(nums.get(i) > nums.get(i + 1) ){
//                 inc = false;
//             }
//             if(nums.get(i) < nums.get(i+1)){
//                 dec = false;
//             }
//         }
//         return inc || dec;

//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> nums = new ArrayList<>();

//         // nums.add(1);
//         // nums.add(2);
//         // nums.add(2);
//         // nums.add(3);
//         // return true


//         nums.add(1);
//         nums.add(3);
//         nums.add(2);
//         // return flase

//         System.out.println(nums);
//         System.out.println(isisotomic(nums));
//     }
// }


// lonely numbers

// import java.util.ArrayList;
// import java.util.Collections;

// public class day27_ArrayList {

//     public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
//         Collections.sort(nums);
//         ArrayList<Integer> list = new ArrayList<>();

//         // single element case
//         if (nums.size() == 1) {
//             list.add(nums.get(0));
//             return list;
//         }

//         // first element
//         if (nums.get(0) + 1 < nums.get(1)) {
//             list.add(nums.get(0));
//         }

//         // middle elements
//         for (int i = 1; i < nums.size() - 1; i++) {
//             if (nums.get(i - 1) + 1 < nums.get(i) &&
//                 nums.get(i) + 1 < nums.get(i + 1)) {
//                 list.add(nums.get(i));
//             }
//         }

//         // last element
//         if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
//             list.add(nums.get(nums.size() - 1));
//         }

//         return list;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> nums = new ArrayList<>();

//         nums.add(10);
//         nums.add(6);
//         nums.add(5);
//         nums.add(8);

//         System.out.println(findLonely(nums));
//     }
// }



// Most Frequent Number following Key(EASY)
import java.util.*;

public class day27_ArrayList {

    public static int mostFrequent(ArrayList<Integer> nums, int key) {

        int[] result = new int[1000]; // frequency array

        // Step 1: count frequency of elements coming after key
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                int next = nums.get(i + 1);
                result[next - 1]++;   // frequency increase
            }
        }

        // Step 2: find element with maximum frequency
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;   // क्योंकि index = number - 1
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(
                Arrays.asList(2, 5, 2, 5, 2, 3)
        );

        int key = 2;

        int result = mostFrequent(nums, key);

        System.out.println("Most Frequent element after key: " + result);
    }
}
