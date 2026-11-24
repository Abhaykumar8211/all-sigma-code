// import java.util.ArrayList;
// import java.util.List;

// public class day27_ArrayList {
//     // public static void main(String[] args) {
//     //     ArrayList<Integer> List = new ArrayList<>();
//     //     List.add(1);
//     //     List.add(2);
//     //     List.add(3);
//     //     List.add(4);
//     //     List.add(5);

//     //     System.out.println(List);  
//     //     System.out.println(List.get(0));
//     //     System.out.println(List.remove(0)); //index 0 ka element remove ho jayega
//     //     System.out.println(List);
//     //     System.out.println(List.contains(2)); //array element me hai to true nahi to false
//     //     System.out.println(List.contains(6));
//     // }


//     // public static void main(String[] args) {
//     //     ArrayList<Integer> List = new ArrayList<>();
//     //     List.add(1);
//     //     List.add(2);
//     //     List.add(3);
//     //     List.add(4);
//     //     List.add(5);


//     //     System.err.println("ArrayList of Size: = "+List.size());

//     //     for(int i=0; i<List.size(); i++){    //print array
//     //         System.out.print(List.get(i)+" ");
//     //     }

//     //     // print revers
//     //     System.out.println();
//     //     for(int i=List.size()-1; i>=0; i--){
//     //         System.out.print(List.get(i)+" ");
//     //     }
//     // }




//     //find maximum value
//     // public static void main(String[] args) {
//     //     ArrayList<Integer> List = new ArrayList<>();
//     //     List.add(1);
//     //     List.add(2);
//     //     List.add(3);
//     //     List.add(4);
//     //     List.add(5);

//     //     int max = Integer.MIN_VALUE;

//     //     for(int i=0; i<List.size(); i++){
//     //         if(max < List.get(i)){
//     //             max = List.get(i);
//     //         }
//     //     }
//     //     System.out.println("Max element : "+max);
//     // }


//     // swap array

//      public static void swap(ArrayList<Integer>List,int idx1, int idx2){
//             int temp = List.get(idx1);
//             List.set(idx1, List.get(idx2));
//             List.set(idx2, temp);



//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> List = new ArrayList<>();

//         List.add(1);
//         List.add(2);
//         List.add(3);
//         List.add(4);
//         List.add(5);

//         int idx1 = 1, idx2 = 3;
//         System.out.println("before swap: "+List);
//         swap(List, idx1, idx2);
//         System.out.println("After swap: "+List);

//         System.err.println();
//     }

// }

// import java.util.*;
// public class day27_ArrayList {

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(5);
//         list.add(1);
//         list.add(9);

//     Collections.sort(list);  // jab ham array ko sorted karte hai to ese karte hai isending me
//     System.out.println(list);

//     //descending order me
//     Collections.sort(list, Collections.reverseOrder());
//     System.out.println(list);
//     }
// }

// import java.util.ArrayList;

// public class day27_ArrayList {

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList();

//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>();


//         for(int i=0; i<=5; i++){
//             list1.add(i*1);
//             list2.add(i*2);
//             list3.add(i*3);
//         }

//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);

//         System.out.println(mainList);

//         for (int i = 0; i < mainList.size(); i++) {
//             ArrayList<Integer> currList = mainList.get(i);
//             for (int j = 0; j < currList.size(); j++) {
//                 System.out.print(currList.get(j) + " ");
//             }
//             System.out.println();
//         }


//     }
// }

// import java.util.*;

// public class day27_ArrayList {
//     public static int storewater(ArrayList<Integer> height){
//         int maxwater = 0;
//         for(int i=0; i<height.size(); i++){
//             for(int j=i+1; j<height.size(); j++){
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int width = j-i;
//                 int currentwater = ht * width;
//                 maxwater = Math.max(maxwater, currentwater);
//             }
//         }
//         return maxwater;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();

//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println(storewater(height));
//     }
// }



// Use Two Pointer Approach (O(n))
// import java.util.*;

// public class day27_ArrayList {

//     public static int storewater(ArrayList<Integer> height) {
//         int maxwater = 0;
//         int left = 0;
//         int right = height.size() - 1;

//         while (left < right) {
//             int ht = Math.min(height.get(left), height.get(right));
//             int width = right - left;
//             int currentwater = ht * width;

//             maxwater = Math.max(maxwater, currentwater);

//             // Move smaller height
//             if (height.get(left) < height.get(right)) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }

//         return maxwater;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();

//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println(storewater(height));
//     }
// }


// Condition: ArrayList sorted hona chahiye pair sum 1
// import java.util.*;
// public class day27_ArrayList {

//     public static boolean pairSum1(ArrayList<Integer> list, int target) {
//         int left = 0;
//         int right = list.size() - 1;

//         while (left < right) {
//             int sum = list.get(left) + list.get(right);

//             if (sum == target) {
//                 return true;
//             } else if (sum < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         int target = 5;

//         System.out.println(pairSum1(list, target));
//     }
// }



// 2 pointer approch o(n)
import java.util.*;
public class day27_ArrayList {



    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp = -1;

        // Step 1: Find breaking point (pivot)
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        // Step 2: Initialize pointers
        int left = bp + 1; // smallest element
        int right = bp;    // largest element

        // Step 3: Two pointer in circular way
        while (left != right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                return true;
            }

            if (sum < target) {
                left = (left + 1) % n;  // move forward
            } else {
                right = (n + right - 1) % n;  // move backward
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Sorted + Rotated Array
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum2(list, target));
    }
}


    
