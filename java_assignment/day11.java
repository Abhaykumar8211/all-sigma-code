// public class day2 {
//     public static void main(String args[]){
//         for(int i = 0; i<5; i++){
//             System.out.println("hellow");
//         i+= 2;
//     }
       
//     }
    
// }

// import java.util.Scanner;
// public class day2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n == 2){
//             System.out.println("in a prime");

//         }else{
//             boolean isprime = true;
//            for(int i=2; i<n-1; i++){
//               if(n%i == 0){
//                 isprime = false;
//                }

//           }
//           if(isprime == true){
//             System.out.println("in a prime");
//           }else{
//             System.out.print("is a not prime");
//         }
//         }
//         sc.close();
//     }
// }

// user se input lo aur check karo ki perfect number hai ya nahi
// import java.util.Scanner;
// public class day2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i = 1; i<n; i++){
//             if(n%i == 0){
//                 sum+=i;
//             }

//         }
//         if(sum==n){
//             System.out.println("perfect number");
//         }else{
//             System.out.println("not perfect number");
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class day2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number;
//         int choise;
//         int evensum = 0;
//         int oddsum = 0;
//         do{
//             System.out.print("Enter your number");
//             number = sc.nextInt();
//             if(number%2 == 0){
//                 evensum+= number;
//             }else{
//                 oddsum+= number;
//             }
//             System.out.print("Do you want to continue? Press 1 for yes or 0 for no");

//             choise = sc.nextInt();
//         }while(choise == 1);
//             System.out.println("sum of number: "+evensum);
//             System.out.println("sum of number: "+oddsum);
        
        

//     }

// }


// import java.util.Scanner;
// public class day2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num; // to hold number
//         int fact = 1; // to hold factoriaql

//         System.out.print("Enter any positive integer: ");
//         num = sc.nextInt();

//         for(int i=1; i<=num; i++){
//             fact *= i;
//         }System.out.println("Factorial: "+fact);

//         sc.close();
        
        

//     }
    
// }

import java.util.Scanner;
public class day11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();

        if(num<0){
            System.out.println("Factorial does not exist for negative numbers.");
        }else{
            long factorial = 1;
        
        for(int i=1; i<=num; i++){
            factorial = factorial*i;
        }
        System.out.println("factorial of "+ num +" is: " +factorial);
       }   
        sc.close();
        

    }
    
}