// public class day22_RecursionBasic {
//     public static void printDec(int n){
//         if(n == 1){
//             System.out.println(1);
//             return;
//         }
//         System.out.print(n+" ");
//         printDec(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         printDec(n);
//     }
    
// }


// public class day22_RecursionBasic {
//     public static void printinc(int n){
//         if(n == 1){
//             System.out.print(1);
//             return;
//         }
//         printinc(n-1);
//         System.out.print(n+" ");
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         printinc(n);

//     }
// }


// factorial number
// public class day22_RecursionBasic {
//     public static int fact(int n){
//         if(n == 0){
//             return 1;
//         }
//         int fnm1 = fact(n-1);
//         int fn = n * fact(n-1);
//         return fn;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fact(n));
//     }
// }

// print sum of first n natural numbers
// public class day22_RecursionBasic {
//     public static int sum(int n){
//         if(n == 1){
//             return 1;
//         }
//         int sm1 = sum(n-1);
//         int sn = n + sum(n-1);
//         return sn;
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println(sum(n));
//     }
// }


// most complex fibnacci quesion
// public class day22_RecursionBasic {
//     public static int fib(int n){
//         if(n == 0 || n == 1){
//             return n;
//         }
//         int nm1 = fib(n-1);
//         int nm2 = fib(n-2);
//         int fb = nm1 + nm2;
//         return fb;

//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fib(n));
//     }
// }


// if check is Sorted or not
// public class day22_RecursionBasic {
//     public static boolean isSorted(int arr[], int i){
//         if(i == arr.length-1){
//             return true;
//         }
//         if(arr[i] > arr[i+1]){
//             return false;
//         }
//         return isSorted(arr, i+1);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5};
//         System.out.println(isSorted(arr, 0));
        
//     }
// }

// find the first occurence
// public class day22_RecursionBasic {
//     public static int firstoc(int arr[], int key, int i){
//         if(i == arr.length){
//             return -1;
//         }
//         if(arr[i] == key){
//             return i;
//         }
//         return firstoc(arr, key, i+1);
//     }

//     public static void main(String[] args) {
//         int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         System.out.println(firstoc(arr, 5, 0));
        
//     }
// }


// / find the last occurence
// public class day22_RecursionBasic {

//     public static int lastoc(int arr[], int key, int i){
//         if(i == arr.length){
//             return -1;
//         }

//         int isFound = lastoc(arr, key, i + 1);

//         if(isFound == -1 && arr[i] == key){
//             return i;
//         }

//         return isFound;
//     }

//     public static void main(String args[]){
//         int arr[] = {1, 4, 5, 7, 8, 4, 5, 9};
//         System.out.println(lastoc(arr, 5, 0));
//     }
// }

// print x to the power n
public class day22_RecursionBasic {
    public static int poweroptimize(int x, int n){
        if(n == 0){
            return 1;
        }
        int optimizesq = poweroptimize(x , n/2) * poweroptimize(x, n/2);
        if(n%2 != 0){
            optimizesq = x * optimizesq;
        }
        return optimizesq;

    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(poweroptimize(x, n));
    }
}