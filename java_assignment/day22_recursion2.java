// public class day22_recursion2 {
//     public static void findindexvalus(int arr[], int key, int i){
//         if(i == arr.length){
//             return;
//         }
//         if(arr[i] == key){
//             System.out.print(i+" ");
//         }
//         findindexvalus(arr, key, i+1);
//     }
//     public static void main(String[] args) {
//         int arr[] =  {3, 2, 4, 5, 6, 2, 7, 2, 2};
//         int key = 2;
//         findindexvalus(arr, key, 0);
//     }
    
// }




// public class day22_recursion2 {

//     static String digits[] = {
//         "zero","one","two","three","four",
//         "five","six","seven","eight","nine"
//     };
//     public static void printDigits(int n){
//         if(n == 0){
//             return;
//         }
//         int lastDigit = n%10;
//         printDigits(n/10);
//         System.out.print(digits[lastDigit]+" ");
//     }

//     public static void main(String[] args) {
//         int n = 2005;
//         printDigits(n);

//     }
// }



// Write a program to findLength of aStringusing Recursion
// public class day22_recursion2 {
//     public static int length(String str){
//         if(str.length() == 0){
//             return 0;

//         }

//         return length(str.substring(1))+1;
//     }

//     public static void main(String[] args) {
//         String str = "abhay";
//         System.out.println(length(str));
//     }
// }



public class day22_recursion2 {
    public static int substring(String str, int i, int j, int n){
        if(n == 1){
            return 1;
        }

        if(n <= 0){
            return 0;
        }

        int res = substring(str, i+1, j, n-1) + substring(str, i, j-1, n-2) + substring(str, i, j-1, n-2);
        
        if(str.charAt(i) == str.charAt(j)){
            
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(substring(str, 0, n-1, n));
    }
}
