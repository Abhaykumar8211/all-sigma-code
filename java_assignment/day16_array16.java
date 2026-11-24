// public class day16_array16 {
//     public static boolean containsDuplicate(int nums[]){
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
                
//             }
//         }
//         return false;

//     }
//     public static void main(String[] args) {
//          int nums[] = {1, 2, 3, 1};
//          System.out.println(containsDuplicate(nums));

        
//     }


    
// }



// public class day16_array16 {
//     public static boolean containsDuplicate(int nums[]){
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
                
//             }
//         }
//         return false;

//     }
//     public static void main(String[] args) {
//          int nums[] = {1, 2, 3, 4};
//          System.out.println(containsDuplicate(nums));

        
//     }


    
// }


// public class day16_array16 {

//     // Main search function
//     public static int search(int[] nums, int target) {

//         int min = findPivot(nums);   // smallest element index

//         // Agar target right sorted part me hai
//         if(nums[min] <= target && target <= nums[nums.length - 1]){
//             return binarySearch(nums, min, nums.length - 1, target);
//         }
//         // Warna left sorted part me search karo
//         else{
//             return binarySearch(nums, 0, min - 1, target);
//         }
//     }

//     // Normal Binary Search
//     public static int binarySearch(int[] nums, int left, int right, int target){

//         while(left <= right){

//             int mid = left + (right - left) / 2;

//             if(nums[mid] == target){
//                 return mid;
//             }
//             else if(nums[mid] > target){
//                 right = mid - 1;
//             }
//             else{
//                 left = mid + 1;
//             }
//         }

//         return -1;
//     }

//     // Find Pivot (minimum element index)
//     public static int findPivot(int[] nums){

//         int left = 0;
//         int right = nums.length - 1;

//         while(left < right){

//             int mid = left + (right - left) / 2;

//             if(nums[mid] > nums[right]){
//                 left = mid + 1;
//             }
//             else{
//                 right = mid;
//             }
//         }

//         return left;
//     }

//     // Main Method
//     public static void main(String[] args) {

//         int nums[] = {4,5,6,7,0,1,2};
//         int target = 0;

//         int result = search(nums, target);

//         System.out.println(result);
//     }
// }


// public class day16_array16 {

//     public static int maxProfit(int[] prices){

//         int minPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i = 0; i < prices.length; i++){

//             if(prices[i] < minPrice){
//                 minPrice = prices[i];
//             }
//             else{
//                 int profit = prices[i] - minPrice;

//                 if(profit > maxProfit){
//                     maxProfit = profit;
//                 }
//             }
//         }

//         return maxProfit;
//     }

//     public static void main(String args[]){

//         int prices[] = {7, 1, 5, 3, 6, 4};

//         System.out.println(maxProfit(prices));
//     }
// }


// public class day16_array16 {

//     // Two Pointer Trapping Rain Water
//     public static int trap(int[] height) {

//         int n = height.length;
//         int res = 0;
//         int l = 0;
//         int r = n - 1;

//         int lMax = height[l];
//         int rMax = height[r];

//         while (l < r) {

//             if (lMax < rMax) {

//                 l++;
//                 lMax = Math.max(lMax, height[l]);
//                 res += lMax - height[l];

//             } else {

//                 r--;
//                 rMax = Math.max(rMax, height[r]);
//                 res += rMax - height[r];
//             }
//         }

//         return res;
//     }

//     public static void main(String args[]) {

//         int height[] = {4,2,0,6,3,2,5};

//         System.out.println(trap(height));
//     }
// }


import java.util.*;

public class  day16_array16{

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {

            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;

                    left++;
                    right--;

                } 
                else if(sum < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }

        return result;
    }
}