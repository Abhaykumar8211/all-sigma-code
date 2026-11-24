// public class day17_sorting {
//     public static void selectiom_sorting(int arr[]) {
//         int n = arr.length;
//         for(int i=0; i<n-1; i++){
//             int min =  i;
//             for(int j = i+1; j<n; j++){
//                 if(arr[j] < arr[min]){
//                     min = j;
//                 }
//             }

//             int temp = arr[i];
//             arr[i] = arr[min];
//             arr[min] = temp;
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {3,6,2,1,8,7,4,5,3,1};
//         selectiom_sorting(arr);

//         for(int k =0; k<arr.length; k++){
//             System.out.print(arr[k]+" ");
//         }

//     }
    
// }


// public class day17_sorting {
//     public static void bublesorting(int arr[]){
//         int n = arr.length;
//         boolean swapped;

//         for(int i=0; i<n-1; i++){
//             swapped=false;
//             for(int j=0; j<n-i-1; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swapped=true;
//                 }
            
//             }
//             if(swapped == false){
//                 break;
//         }
//     }
        

//     }

//     public static void main(String args[]){
//          int arr[] = {3,6,2,1,8,7,4,5,3,1};
//          bublesorting(arr);

//          for(int i =0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//          }

//     }
// }



// public class day17_sorting {
//     public static void insertionsorting(int arr[]){
//         int n = arr.length;
//         for(int i=0; i<n; i++){
//             int crrvalue = arr[i];
//             int j= i-1;

//             while (j>=0 && arr[j]>crrvalue){
//                 arr[j+1] = arr[j];
//                 j--;


//             } 
//             arr[j+1] = crrvalue;
//         }

//     }

//     public static void main(String[] args) {
//         int arr[] = {3,6,2,1,8,7,4,5,3,1};
//         insertionsorting(arr);
//         for(int i =0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// public class day17_sorting {

//     static void countingSortDescending(int arr[]) {

//         int largest = Integer.MIN_VALUE;

//         // Step 1: Find largest element
//         for(int i = 0; i < arr.length; i++) {
//             largest = Math.max(largest, arr[i]);
//         }

//         // Step 2: Create count array
//         int count[] = new int[largest + 1];

//         // Step 3: Store frequency
//         for(int i = 0; i < arr.length; i++) {
//             count[arr[i]]++;
//         }

//         // Step 4: Fill original array in descending order
//         int j = 0;
//         for(int i = count.length - 1; i >= 0; i--) {
//             while(count[i] < 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }

//     public static void main(String args[]) {

//         int arr[] = {3,6,2,1,8,7,4,5,3,1};

//         countingSortDescending(arr);

//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }




// ab maam vala.............................................................?
// public class day17_sorting {

//     // (a) Bubble Sort Ascending
//     public static void bubbleSortAscending(int arr[]) {
//         for(int i = 0; i < arr.length - 1; i++) {
//             for(int j = 0; j < arr.length - 1 - i; j++) {
//                 if(arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     // (b) Selection Sort Ascending
//     public static void selectionSortAscending(int arr[]) {
//         for(int i = 0; i < arr.length - 1; i++) {
//             int minPos = i;

//             for(int j = i + 1; j < arr.length; j++) {
//                 if(arr[j] < arr[minPos]) {
//                     minPos = j;
//                 }
//             }

//             int temp = arr[i];
//             arr[i] = arr[minPos];
//             arr[minPos] = temp;
//         }
//     }

//     // (c) Insertion Sort Ascending
//     public static void insertionSortAscending(int arr[]) {
//         for(int i = 1; i < arr.length; i++) {
//             int curr = arr[i];
//             int prev = i - 1;

//             while(prev >= 0 && arr[prev] > curr) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }

//             arr[prev + 1] = curr;
//         }
//     }

//     // (d) Counting Sort Ascending
//     public static void countingSortAscending(int arr[]) {
//         int largest = Integer.MIN_VALUE;

//         for(int i = 0; i < arr.length; i++) {
//             largest = Math.max(largest, arr[i]);
//         }

//         int count[] = new int[largest + 1];

//         for(int i = 0; i < arr.length; i++) {
//             count[arr[i]]++;
//         }

//         int j = 0;
//         for(int i = 0; i < count.length; i++) {
//             while(count[i] > 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }

//     public static void printArray(int arr[]) {
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {

//         int arr[] = {8,7,6,5,4,3,3,2,1,1};

//         countingSortAscending(arr);  // yaha kisi bhi method ka naam likh sakte ho

//         printArray(arr);
//     }
// }