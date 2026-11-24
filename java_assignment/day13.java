// write a java method compute the average of tree numbers
// import java.util.*;
// public class day13 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the your fiests number: ");
//         double x = sc.nextDouble();
        
//         System.out.println("Enter the your second number: ");
//         double y = sc.nextDouble();

//         System.out.println("Enter the third number: ");
//         double z = sc.nextDouble();

//         System.out.println("the average value is: "+average(x,y,z));

//     }
//     public static double average(double x, double y, double z) {
//         return(x+y+z)/3;
        
//     }

// }


// write a method named iseven that accept an int argument the method should return true if the argument is even. or false otherwise also write a program to test your method
// import java.util.*;
// public class day13 {
//     public static boolean iseven(int num){
//         return(num%2==0);

//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num = sc.nextInt();

//         if(iseven(num)){
//             System.out.println(num+" is even.");
//         }else{
//             System.out.println(num+" is odd.");
//         }
//         sc.close();

//     }
// }


// Write a Java program to check if a number is a palindrome.
// A number is called a palindrome if the number is equal to the reverse of the number.
// For example, 121 is a palindrome because the reverse of 121 is 121 itself.
// On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321
// import java.util.*;
// public class day13 {
//     public static boolean ispalindrome(int num){
//         int orignal = num;
//         int reverse = 0;

//         while(num>0){
//             int digit = num%10;
//             reverse = reverse * 10 +digit;
//             num = num/10;
//         }
//         return orignal==reverse;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();

//         if(ispalindrome(num)){
//             System.out.println(num+" is a palindrome. ");
//         }else{
//             System.out.println(num+" is b\not a palindrome");
//         }
//         sc.close();
        
//     }
    
// }

// Write a Java method to compute the sum of the digits in an intege
// import java.util.*;
// public class day13 {
//     public static int sumofdigit(int num){
//         int sum = 0;

//         while(num>0){
//             int digit = num%10;
//             sum+= digit;
//             num = num/10;
//         }
//         return(sum);

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//     System.out.println("Enter a number: ");
//     int num = sc.nextInt();

//     System.out.println("sum of digit of "+num+" = "+sumofdigit(num));
//     sc.close();

//     }
    
// }

    

