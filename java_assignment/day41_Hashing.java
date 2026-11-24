// import java.util.*;

// class  day41_Hashing{

//     static class Node {
//         int data;
//         int hd;
//         Node left, right;

//         public Node(int key) {
//             this.data = key;
//             this.hd = Integer.MAX_VALUE;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static void bottomViewHelper(
//             Node root,
//             int curr,
//             int hd,
//             TreeMap<Integer, int[]> map) {

//         // Base case
//         if (root == null) {
//             return;
//         }

//         // If node for this horizontal distance
//         // is not present, add it
//         if (!map.containsKey(hd)) {

//             map.put(hd, new int[]{root.data, curr});

//         } else {

//             // Get existing node information
//             int[] p = map.get(hd);

//             // If current node is at the same or
//             // greater level, replace the old node
//             if (p[1] <= curr) {

//                 p[0] = root.data;
//                 p[1] = curr;
//             }

//             map.put(hd, p);
//         }

//         // Traverse left subtree
//         bottomViewHelper(
//                 root.left,
//                 curr + 1,
//                 hd - 1,
//                 map
//         );

//         // Traverse right subtree
//         bottomViewHelper(
//                 root.right,
//                 curr + 1,
//                 hd + 1,
//                 map
//         );
//     }

//     public static void printBottomView(Node root) {

//         // TreeMap stores:
//         // Horizontal Distance -> {Data, Level}
//         TreeMap<Integer, int[]> map = new TreeMap<>();

//         // Start from root
//         bottomViewHelper(root, 0, 0, map);

//         // Print nodes from left to right
//         for (int[] value : map.values()) {
//             System.out.print(value[0] + " ");
//         }
//     }

//     public static void main(String[] args) {

//         /*
//                  20
//                 /  \
//                8    22
//               / \     \
//              5   3     25
//                 / \
//                10 14
//         */

//         Node root = new Node(20);

//         root.left = new Node(8);
//         root.right = new Node(22);

//         root.left.left = new Node(5);
//         root.left.right = new Node(3);

//         root.right.right = new Node(25);

//         root.left.right.left = new Node(10);
//         root.left.right.right = new Node(14);

//         System.out.println("Bottom view of the given binary tree:");

//         printBottomView(root);
//     }
// }




// ----------------------------------------------------------------------------------------

// import java.util.*;
// public class day41_Hashing {
//     public static int[] twoSum(int[] arr, int target) {
//         Map<Integer, Integer> visited = new HashMap<>();

//         for(int i=0; i<arr.length; i++) {
//             int diff = target - arr[i];

//             if(visited.containsKey(diff)) {
//                 return new int[] {
//                     i,
//                     visited.get(diff)
//                 };
//             }

//             visited.put(arr[i], i);
//         }

//         return new int[] {0, 0};
//     }

//     public static void main(String[] args) {
//         int arr[] = {2, 7, 11, 15};
//         int target = 9;

//         int[] result = twoSum(arr, target);

//         System.out.println(Arrays.toString(result));
//     }
// }





// -------------------------------------------------------------------------------------


import java.util.*;

public class day41_Hashing {

    public static String frequencySort(String s) {

        // 1. Character ki frequency count karna
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {

            map.put(
                s.charAt(i),
                map.getOrDefault(s.charAt(i), 0) + 1
            );
        }

        // 2. PriorityQueue banana
        PriorityQueue<Map.Entry<Character, Integer>> pq =
            new PriorityQueue<>(
                (a, b) ->
                    a.getValue() == b.getValue()
                        ? a.getKey() - b.getKey()
                        : b.getValue() - a.getValue()
            );

        // 3. Map ke entries PriorityQueue me add karna
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            pq.add(e);
        }

        // 4. Final answer banane ke liye
        StringBuilder res = new StringBuilder();

        // 5. PriorityQueue empty hone tak
        while (pq.size() != 0) {

            char ch = pq.poll().getKey();

            int val = map.get(ch);

            while (val != 0) {

                res.append(ch);
                val--;
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {

        String s = "tree";

        String result = frequencySort(s);

        System.out.println(result);
    }
}