// public class day14_pattern {
//     public static void hello_pattern(int rowpattern, int colpattern){
//         for(int i=1; i<=rowpattern; i++){
//             for(int j=1; j<=colpattern; j++){
//                 if(i==1 || i==rowpattern || j==1 || j==colpattern){
//                     System.out.print("*");

//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();


//         }
//     }


//     public static void main(String[] args) {
//         hello_pattern(4, 5);
        
//     }
// }

// public class day14_pattern {
//     public static void inverted_rotade_pyramid(int n){
//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         inverted_rotade_pyramid(4);
//     }
// }


// public class day14_pattern {
//     public static void floyeds_trangle(int n){
//         int counter = 1;
//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++){
//                 System.out.print(counter+" ");
//                 counter++;
//             }
//             System.out.println();
    
//         }
//     }
//     public static void main(String[] args) {
//         floyeds_trangle(5);
//     }
// }



// public class day14_pattern {
//     public static void zero_one_pattern(int n){
//         for(int i=1;i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 if((i+j)%2 ==0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }System.out.println();
//         }
//     }

//     public static void main(String argss[]){
//         zero_one_pattern(4);

//     }
// }


// public class day14_pattern {
//     public static void putterfly(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             for(int j=1; j<=2*(n-i); j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }

//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             for(int j=1; j<=2*(n-i); j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }

//     public static void main(String args[]){
//         putterfly(4);

//     }
// }



// public class day14_pattern {
//     public static void solid_rahombus(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         solid_rahombus(5);
        
//     }
// }

// public class day14_pattern {
//     public static void hello_rahombus(int n){
//         for(int i=1; i<=n; i++){
//             //space
//             for(int j=1; j<n-i; j++){
//                 System.out.print(" ");
//             }
            
//             //hello_rhombus
//             for(int j=1; j<=n; j++){
//                 if(i == 1 || i == n || j == 1 || j == n ){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         hello_rahombus(5);
        
//     }
// }



// 


// public class day14_pattern {

//     public static void main(String[] args) {
//         String str = "helloworld";
//     }
// }