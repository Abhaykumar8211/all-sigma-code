// public class linear_search {
//     public  static int linearsearch(int numbers[], int key){
//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }

//         }
//         return -1;

//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 10;

//         int index = linearsearch(numbers, key);
//         if(index == -1){
//             System.out.println("Not Found");

//         }else{
//             System.out.println("key is at index "+index);
//         }

        
//     }
    
// }



// public class linear_search {
//     public static int linearsearch(String furits[], String key){
//         for(int i=0; i<furits.length; i++){
//             if(furits[i].equals(key)){
//                 return i;
//             }
//         }return -1;
//     }

//     public static void main(String args[]){
//         String furits[] = {"banana","anarsa", "rasbary", "barry" };
//         String key = "barry";
//         int index = linearsearch(furits, key);
//         if(index == -1){
//             System.out.println("not found");
//         }else{
//             System.out.println("key is at index "+index);
//         }
//     }
// }


// import java.util.*;

// public class linear_search {

//     public static int linearsearch(int numbers[], int key){
//         for(int i = 0; i < numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your size of index");
//         int size = sc.nextInt();

//         int numbers[] = new int[size];

//         System.out.println("Enter array elements:");
//         for(int i = 0; i < size; i++){
//             numbers[i] = sc.nextInt();
//         }

//         System.out.println("Enter element to search:");
//         int key = sc.nextInt();

//         int index = linearsearch(numbers, key);

//         if(index == -1){
//             System.out.println("Not Found");
//         } else {
//             System.out.println("Key is at index " + index);
//         }

//         sc.close();
//     }
// }


// linear largest number and smallest number
// import java.util.*;
// public class linear_search {
//     public static int getlargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<numbers.length; i++){
//             if(largest<numbers[i]){
//                 largest=numbers[i];
//             }
//             if(smallest>numbers[i]){
//                 smallest=numbers[i];
                
//             }
//         }
//         System.out.println("smalest value is "+smallest);
//         return largest;
//     }

//     public static void main(String[] args) {
//         int numbers[] = {1, 2, 3, 6, 5};
//         System.out.println("largest number "+getlargest(numbers));
//     }
// }



// binnary search
// public class linear_search {
//     public static int binarysearch(int numbers[], int key){
//         int start = 0, end = numbers.length-1;
//         while(start <= end){
//             int mid = (start + end)/2;

//             if(numbers[mid] == key){
//                 return mid;
//             }
//             if(numbers[mid] < key){
//                 start = mid + 1;  
//             }else{
//                 end = mid - 1;
//             }

//         }
//         return -1;

//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14};
//         int key = 10;
//         System.out.println("index for key is: "+binarysearch(numbers, key));
        
        
//     }
// }

