// public class string_concept {
//     public static void main(String[] args) {
//         String str = "hellow world";
//         System.out.print(str);
//     }
    
// }

// public class string_concept {
//     public static void main(String[] args) {
//         String str = "Hellow world";
//         System.out.println(str.length());
//     }

    
// }


// import java.util.*;
// public class string_concept {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter you name: ");
//         // complete line print nahi karta hai(sc.next se)
//         String str = sc.next();
//         System.out.println(str);
//     }
    
// }

// import java.util.Scanner;

// public class string_concept {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         // complete line print karta hai(sc.nextline se)
//         String str = sc.nextLine();
//         System.out.println(str);


//     }
// }

// add of String
// public class string_concept {

//     public static void main(String[] args) {
//         String str1 = "Abhay";
//         String str2 = "kumar";
//         String str = str1+ " " +str2;
//         System.out.println(str); 
//     }
// }

// public class string_concept {

//     public static void main(String[] args) {
//         String str1 = "Abhay";
//         String str2 = "kumar";
//         String str = str1+ " " +str2;
//         System.out.println(str.charAt(0)); 
//     }
// }


// all letters print karane ke liye function use hota hai
// public class string_concept {
//     public static void printpattern(String str){
//         for(int i=0; i<str.length(); i++){
//             System.out.print(str.charAt(i)+ " ");
//         }
        
//     }
//     public static void main(String[] args) {
//         String str = "Abhay kumar";
//         printpattern(str);

//     }
// }



// palindrom
// public class string_concept {
//     public static boolean palindrom(String str){
//         for(int i=0; i<str.length()/2; i++){
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n-1-i)){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "raccar";
//         System.out.print(palindrom(str));
//     }
// }


// find the path
// public class string_concept {
//     public static float pathfind(String path){
//         int x = 0, y = 0;
//         for(int i=0; i<path.length(); i++){
//             char dir = path.charAt(i);

//             if(dir == 'S'){
//                 y--;
//             }

//             else if(dir == 'N'){
//                 y++;
//             }

//             else if(dir == 'W'){
//                 x--;
//             }

//             else{
//                 x++;
//             }

//         }
//         int x2 = x*x;
//         int y2 = y*y;
//         return (float)Math.sqrt((x2 + y2));

//     }

//     public static void main(String[] args) {
//          String path = "WNEENESENNN";
//         // String path = "NS";
//         System.out.println(pathfind(path));
//     }
// }



// compare tow String 
// public class string_concept {

//     public static void main(String[] args) {
//         String str1 = "Abhay";
//         String str2 = "Abhay";
//         String str3 = new String("Abhay");

//         System.out.println(str1 == str2);
//         System.out.println(str1 == str3);
//         System.out.println(str1.equals(str3));

//     }
// }



// public class string_concept {
//     public static String subString(String str, int si, int ei){
//         String substr = " ";

//         for(int i=si; i<ei; i++){
//             substr += str.charAt(i);
//         }
//         return substr;
//     }

//     public static void main(String[] args) {
//         String str = "Helloworld";
//         System.out.println(subString(str, 0, 5));

//     }
// }



// function 
// public class string_concept {

//     public static void main(String[] args) {
//         String str = "Helloworld";
//         System.out.println(str.substring(0,3));

//     }
// }

// public class string_concept {

//     public static void main(String[] args) {

//         String fruits = "apple mango banana";

//         // String ko array me convert kiya
//         String[] arr = fruits.split(" ");

//         String largest = arr[0];

//         for(int i = 1; i < arr.length; i++){
//             if(largest.compareTo(arr[i]) < 0){
//                 largest = arr[i];
//             }
//         }

//         System.out.println("Largest String: " + largest);
//     }
// }


// String builder
// public class string_concept {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder(" ");
//         for(char ch='a'; ch<'z'; ch++){
//             sb.append(ch);
//         }
//         System.out.println(sb.length());
//     }
// }

// public class string_concept {
//     public static String touppercase(String str){
//         StringBuilder sb = new StringBuilder(" ");

//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for(int i=1; i<str.length(); i++){
//             if(str.charAt(i)==' '&& i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));

//             }else{
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         String str = "hellow world";
//         System.out.println(touppercase(str));
//     }
// }



// quenstion no. 5; String compress
 public class string_concept {
    public static String compress(String str){
        String newstr = "";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count>1){
                newstr +=count.toString();
            }
        }
        return newstr;
    }
 
    public static void main(String[] args) {
     String str = "aabbcccdd";
     System.out.println(compress(str));
    }
 }