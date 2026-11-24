// public class day33_Gready_approach {

//     static int BalancedPartition(String str, int n) {

//         int l = 0, r = 0;
//         int ans = 0;

//         for (int i = 0; i < n; i++) {

//             if (str.charAt(i) == 'L') {
//                 l++;
//             } else {
//                 r++;
//             }

//             // jab L == R ho jaye
//             if (l == r) {
//                 ans++;
//             }
//         }

//         return ans;
//     }

//     public static void main(String[] args) {

//         String str = "LRRRRLLRLLRL";
//         int n = str.length();

//         System.out.println("Maximum Balanced Partitions: " + BalancedPartition(str, n));
//     }
// }




// question -2 ---------------------------------------------------------?
// public class day33_Gready_approac {

//     public static int kthOdd(int[] range, int K) {

//         if (K <= 0)
//             return 0;

//         int L = range[0];
//         int R = range[1];

//         if ((R & 1) > 0) {   // R is odd

//             int Count = (int) Math.ceil((R - L + 1) / 2.0);

//             if (K > Count)
//                 return 0;
//             else
//                 return (R - 2 * K + 2);

//         } else {   // R is even

//             int Count = (R - L + 1) / 2;

//             if (K > Count)
//                 return 0;
//             else
//                 return (R - 2 * K + 1);
//         }
//     }

//     public static void main(String args[]) {

//         int[] p = { -3, 3 };
//         int k = 1;

//         System.out.println(kthOdd(p, k));
//     }
// }



// question - 3 ---------------------------------------------------?
// import java.util.Arrays;

// public class day33_Gready_approac {

//     public static char[] lexo_small(int n, int k) {

//         char arr[] = new char[n];

//         // fill all with 'a'
//         Arrays.fill(arr, 'a');

//         // remaining value after putting 'a' in all places
//         k = k - n;

//         for (int i = n - 1; i >= 0; i--) {

//             if (k <= 0)
//                 break;

//             // add maximum possible value (max 25 because 'a' already taken)
//             int add = Math.min(25, k);

//             arr[i] = (char) (arr[i] + add);
//             k -= add;
//         }

//         return arr;
//     }

//     public static void main(String[] args) {

//         int n = 5, k = 42;

//         char arr[] = lexo_small(n, k);

//         System.out.println(new String(arr));
//     }
// }



// question - 4 ---------------------------------------------------?
// public class day33_Gready_approac {

//     static int maxProfit(int prices[], int n) {

//         int buy = prices[0];
//         int max_profit = 0;

//         for (int i = 1; i < n; i++) {

//             if (buy > prices[i]) {
//                 buy = prices[i];
//             } else if (prices[i] - buy > max_profit) {
//                 max_profit = prices[i] - buy;
//             }
//         }

//         return max_profit;
//     }

//     public static void main(String args[]) {

//         int prices[] = {7, 1, 5, 6, 4};
//         int n = prices.length;

//         int max_profit = maxProfit(prices, n);

//         System.out.println(max_profit);
//     }
// }




// question - 5 ---------------------------------------------?
public class day33_Gready_approac {

    public static int ans = 10000000;

    public static void solve(int a[], int n, int k, int index, int sum, int maxsum) {

        if (k == 1) {

            maxsum = Math.max(maxsum, sum);

            sum = 0;
            for (int i = index; i < n; i++) {
                sum += a[i];
            }

            maxsum = Math.max(maxsum, sum);
            ans = Math.min(ans, maxsum);
            return;
        }

        sum = 0;

        for (int i = index; i < n; i++) {

            sum += a[i];
            maxsum = Math.max(maxsum, sum);

            solve(a, n, k - 1, i + 1, sum, maxsum);
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};
        int k = 3;  // K subarrays
        int n = arr.length;

        solve(arr, n, k, 0, 0, 0);

        System.out.println(ans);
    }
}