// import java.util.*;

// public class day21_recursion {

//     static void findAllIndices(int[] arr, int index, int key, List<Integer> result) {

//         // Base case
//         if (index == arr.length) {
//             return;
//         }

//         // If match found
//         if (arr[index] == key) {
//             result.add(index);
//         }

//         // Recursive call
//         findAllIndices(arr, index + 1, key, result);
//     }

//     public static void main(String[] args) {

//         int[] arr = {3, 2, 4, 5, 6, 2, 7, 2};
//         int key = 2;

//         List<Integer> result = new ArrayList<>();

//         findAllIndices(arr, 0, key, result);

//         // Print result
//         for (int idx : result) {
//             System.out.print(idx + " ");
//         }
//     }
// }


// public class day21_recursion {

//     static String[] words = {
//             "zero", "one", "two", "three", "four",
//             "five", "six", "seven", "eight", "nine"
//     };

//     static void convertToWords(int n, StringBuilder result) {

//         if (n == 0) {
//             return;
//         }

//         int digit = n % 10;

//         convertToWords(n / 10, result);

//         result.append(words[digit]).append(" ");
//     }

//     public static void main(String[] args) {

//         int n = 1947;

//         if (n == 0) {
//             System.out.println("zero");
//         } else {

//             StringBuilder result = new StringBuilder();

//             convertToWords(n, result);

//             System.out.println(result.toString().trim());
//         }
//     }
// }
