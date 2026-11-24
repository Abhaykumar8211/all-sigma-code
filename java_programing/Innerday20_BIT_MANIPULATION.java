// public class day20_BIT_MANIPULATION {
//     public static int binary_AND(int a, int b){
//         return a & b;
//     }


//     public static int binary_OR(int a, int b){
//         return a | b;
//     }


//     public static int binary_XOR(int a, int b){
//         return a ^ b;
//     }

//     public static int binary_compement(int a){
//         return ~ a;
        
//     }

//     public static int binary_leftshift(int a , int b){
//         return a<<b;
//     }


//     public static int binary_rightshift(int a, int b){
//         return a>>b;
//     }
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 1;
//         // System.out.println(binary_AND(a, b));
//         // System.out.println(binary_OR(a, b));
//         // System.out.println(binary_compement(a));
//         // System.out.println(binary_leftshift(a, b));
//         System.out.println(binary_rightshift(a, b));
//     }   
// }


// chreck if a number is odd or even

// public class Innerday20_BIT_MANIPULATION {
//     public static void evenorodd(int n){
//         int bitmask = 1;
//         if((n & bitmask) == 0){
//             System.out.println("even number");

//         }else{
//             System.out.println("odd number");
//         }
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         evenorodd(n);
//     }

    
// }

// operation ..................../?
// 



// check if a number is a power of 2
// public class Innerday20_BIT_MANIPULATION {
//     public static boolean ispower(int n){
//         return (n & (n-1)) == 0;
//     }

//     public static void main(String[] args) {
//         System.out.println(ispower(15));
        
//     }
// }



// count set bits in a numbers
// public class Innerday20_BIT_MANIPULATION {
//     public static int countset(int n){
//         int count = 0;
//         while(n>0){
//             if((n & 1 ) != 0){
//                 count ++;
//             }
//             n = n>>1;
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         System.out.println(countset(15));
        
//     }
// }


public class Innerday20_BIT_MANIPULATION {
    public static int fast_exponentiation(int a, int n){
        int ans = 1;
        while (n>0){
            if((n & 1) != 0){
                ans = ans*a;

            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fast_exponentiation(10, 2));
        
    }
}