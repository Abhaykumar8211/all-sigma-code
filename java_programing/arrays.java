// import java.util.*;
// public class arrays {
//     public static void main(String args[]){
//     int marks[] = new int[100];

//     Scanner sc = new Scanner(System.in);

//     marks[0] = sc.nextInt();
//     marks[1] = sc.nextInt();
//     marks[2] = sc.nextInt();

//     marks[2] = marks[2] + 1;

//     System.out.println("physics: "+marks[0]);
//     System.out.println("chemestry: "+marks[1]);
//     System.out.println("math: "+marks[2]);

//     int parsentage = (marks[0]+marks[1]+marks[2])/3;
//     System.out.println("persantage is: "+parsentage+"%");

    
    
//     sc.close();
//     }
   
// }

// public class arrays {

//     public static void main(String args[]){

//         int marks[] = new int[100];

//         System.out.println("lenth of arrays "+marks.length);
        
//     }
// }


// call by refrence
// public class arrays {
//     public static void update(int marks[]){
//         for(int i=0; i<marks.length; i++){
//             marks[i] = marks[i]+1;
//         }
//     }

//     public static void main(String[] args) {
//         int marks[] = {97, 98, 99};
//         update(marks);

//         for(int i=0; i<marks.length; i++){
//         System.out.println(marks[i]+" ");
//     }

//     }
// }




// reverse array
// public class linear_search {
//     public static void revers(int numbers[]){
//         int first = 0, last = numbers.length - 1;

//         while (first<last) {
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first ++;
//             last --;
            
//         }
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         revers(numbers);
//         for(int i=0; i<numbers.length; i++){
//             System.out.print(numbers[i] + " ");
//         }
//         System.out.println();

//     }
// }


// printpairs
// public class linear_search {
//     public static void printpairs(int numbers[]){
//         int tp = 0;
//         for(int i=0; i<numbers.length; i++){
//             int cur = numbers[i];

//             for(int j=i+1; j<numbers.length; j++){
//                 System.out.print("(" + cur + numbers[j] + ") ");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs = " +tp);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         printpairs(numbers);
//     }
// }



// print subarray
// public class linear_search {
//     public static void subarray(int numbers[]){
//         int tp = 0;
//         for(int i=0; i<numbers.length; i++){
//             int start = i;
//             for(int j=i; j<numbers.length; j++){
//                 int end = j;
//                 for(int k=start; k<end; k++){
//                     System.out.print(numbers[k]+" ");
//                 }
//                 tp++;
//                 System.out.println();

//            }
//            System.out.println();
//         }
//         System.out.println("total subarray: "+tp);
        
        
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         subarray(numbers);
//     }
// }


// public class linear_search {
//     public static void subarray(int numbers[]){
//         int tp = 0;
//         int maxsum = Integer.MIN_VALUE;
//         int minsum = Integer.MAX_VALUE;

//         for(int i=0; i<numbers.length; i++){
//             int start = i;

//             for(int j=i; j<numbers.length; j++){
//                 int end = j;

//                 int sum = 0;

//                 for(int k=start; k<=end; k++){
//                     System.out.print(numbers[k]+ " ");
//                     sum += numbers[k];
//                 }
//                 System.err.println(" | sum = "+sum);

//                 if(sum>maxsum){
//                     maxsum = sum;
//                     System.out.println("Maximum subarray: "+maxsum);
//                 }
//                 if(sum<minsum){
//                     minsum = sum;
//                     System.out.println("Minmum subarray: "+minsum);
//                 }
//                 tp++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("total subarray: "+tp);
        
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         subarray(numbers);
//     }
// }



// arra 2  .................*****************************************************************

// maximum sub array sum
// public class linear_search {
//     public static void maxarraysum(int numbers[]){
//         int currsum = 0;
//         int maxsum = Integer.MIN_VALUE;

//         for(int i=0; i<numbers.length; i++){
//             int start =i;

//             for(int j=i; j<numbers.length; j++){
//                 int end = j;
//                 currsum = 0;

//                 for(int k=start; k<=end; k++){
//                     currsum += numbers[k];
//                 }
//                 System.out.println(currsum);

//                 if(maxsum < currsum){
//                     maxsum = currsum;
//                 }
//             }
//         }
//         System.out.println("max sum = "+maxsum);

//     }

//     public static void main(String[] args) {
//         int numbres[] = {2, 4, 6, 8, 10};
//         maxarraysum(numbres);

//     }
// }


// maxsumarray sum(prefix array)
// public class linear_search {
//     public static void maxarraysum(int numbers[]){
//         int currsum = 0;
//         int maxsum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0];
//         // calculate prefix array
//         for(int i=1; i<prefix.length; i++){
//             prefix[i] = prefix[i-1] + numbers[i];

//         }

//         for(int i=0; i<numbers.length; i++){
//             int start =i;

//             for(int j=i; j<numbers.length; j++){
//                 int end = j;

//                 currsum = start ==  0? prefix[end] : prefix[end] - prefix[start-1];

//                 if(maxsum < currsum){
//                     maxsum = currsum;
//                 }
//             }
//         }
//         System.out.println("max sum = "+maxsum);

//     }

//     public static void main(String[] args) {
//         int numbres[] = {2, 4, 6, 8, 10};
//         maxarraysum(numbres);

//     }
// }


// public class linear_search {
//     public static void kandas(int numbers[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;
        
//         for(int i=0; i<numbers.length; i++){
//             cs = cs + numbers[i];
//             if(cs < 0){
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }
//         System.out.println("our max subarray sum is : "+ms);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//         kandas(numbers);
//     }
// }


// vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv................i
// public class linear_search {
//     public static void kandas(int numbers[]){
//         int cs = 0;
//         int ms = Integer.MIN_VALUE;

//         for(int i=0; i<numbers.length; i++){
//             cs = cs + numbers[i];

//             if(cs < 0){
//                 cs = -1;
//             }
//             ms = Math.max(cs, ms);
//         }
//         System.out.println("our max sub array sum is : "+ms);

//     }

//      public static void main(String[] args) {
//         int numbers[] = {-1, -2, -3, -4};
//         kandas(numbers);
//     }
// }


// public class linear_search {
//     public static void kandas(int numbers[]){
//         int cs = 0;
//         int ms = Integer.MAX_VALUE;

//         for(int i=0; i<numbers.length; i++){
//             cs = cs + numbers[i];

//             if(cs < 0){
//                 cs = -1; 
//             }
//             ms = Math.min(cs, ms);
//         }
//         System.out.println("our max sub array sum is : "+ms);

//     }

//      public static void main(String[] args) {
//         int numbers[] = {-1, -2, -3, -4};
//         kandas(numbers);
//     }
// }

// public class arrays {
//     public static int trappedrainwarter(int height[]){
//         int n = height.length;
//         int leftmax[] = new int[n];
//         leftmax[0] = height[0];

//         for(int i=1; i<n; i++){
//             leftmax[i] = Math.max(height[i], leftmax[i-1]);

//         }

//         int rightmax[] = new int[n];
//         rightmax[n-1] = height[n-1];

//         for(int i=n-2; i>=0; i--){
//             rightmax[i] = Math.max(height[i], rightmax[i+1]);
//         }
//         int trappewarter = 0;

//         for(int i =0; i<n; i++){
//             int waterlevel = Math.min(leftmax[i], rightmax[i]);

//             trappewarter += waterlevel-height[i];
//         }

//         return trappewarter;



//     }

//     public static void main(String[] args) {
//         int height[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.println(trappedrainwarter(height));
//     }
// }


// public class arrays {
//     public static int trappedrainwater(int height[]){
//         int n = height.length;
//         int leftmax[] = new int[n];
//         leftmax[0] = height[0];
//         for(int i=1; i<n; i++){
//             leftmax[i] = Math.max(height[i], leftmax[i-1]);

//         }

//         int rightmax[] = new int[n];
//         rightmax[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--){
//             rightmax[i] = Math.max(height[i], rightmax[i+1]);
            
//         }

//         int trappedwater = 0;
//             for(int i=0; i<n; i++){
//                 int waterlevel = Math.min(leftmax[i], rightmax[i]);
//             trappedwater += waterlevel-height[i];
//             }

//             return trappedwater;

    
//     }

//     public static void main(String[] args) {
//         int height[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.print(trappedrainwater(height));
//     }
// }




// buy and sell srock
// public class arrays {
//     public static int buyandsellstock(int prices[]){
//         int buyprices = Integer.MAX_VALUE;
//         int maxprofit = 0;

//         for(int i=0; i<prices.length; i++){
//             if(buyprices < prices[i]){
//                 int profit = prices[i] - buyprices;
//                 maxprofit = Math.max(maxprofit,profit);

//             }else{
//                 buyprices = prices[i];
//             }
//         }
//         return maxprofit;
//     }

//     public static void main(String[] args) {
//         int prices[] = {7, 1, 5, 3, 6, 4};
//         System.out.println(buyandsellstock(prices));
//     }
// }



