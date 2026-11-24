// Write a Java program to get a number from the user and print whether it is positive or negative
// import java.util.*;
// public class day10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();

//         if(num>=0){
//             System.out.println("your number "+num+" is possetive");
//         }else{
//             System.out.println("your number "+num+" is negative");
//         }
//         sc.close();
//     }
    
// }


// Finish the following Java code so that it prints "You have a fever" if the temperature is above 100, otherwise it prints "You don't have a fever.

// import java.util.*;
// public class day10 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your temperature: ");
//         double temperature = sc.nextDouble();
//         temperature = 0;

//         if(temperature>=100){
//             System.out.println("you have a fever");

//         }else{
//             System.out.println("you do not have temperature");
//         }
//     }
// }


// Write a Java program to input a week number (1–7) and print the day of the week name using a switch case statement

// import java.util.*;
// public class day10 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("please inter your week number(1-7): ");
//         int week = sc.nextInt();

//         switch(week){
//             case 1 : System.out.println("Monday");
//                      break;

//             case 2 : System.out.println("Tuesday");
//                      break;

//             case 3 : System.out.println("Wednesday");
//                      break;

//             case 4 : System.out.println("Thursday");
//                      break;

//             case 5 : System.out.println("Friday");
//                      break;

//             case 6 : System.out.println("Saturday");
//                      break;

//             case 7 : System.out.println("Sunday");
//                      break;

//             default : System.out.println("please not enter the number greater then 7: ");
//         }
//         sc.close();

//     }
// }


// Write a Java program that takes a year from the user and prints whether that year is a leap year or not

// import java.util.*;
// public class day10 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("please Enter a year: ");
//         int year = sc.nextInt();

//         boolean x = (year % 4) == 0;
//         boolean y = (year % 100)!=0;
//         boolean z = ((year % 100==0) && (year % 400==0)); 

//         if(x && (y||z)){
//             System.out.println("Enter yourr year "+year+ " is leap year");

//         }else{
//             System.out.println("Enter you year "+year+ " is not leap year");
//         }
//         sc.close();
//     }
// }