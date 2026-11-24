// import java.util.*;

// public class day31_Stack_2 {

//     public static boolean isvalid(String str){
//         Stack<Character> s = new Stack<>();

//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i);

//             // 🔹 Opening bracket → push
//             if(ch == '(' || ch == '{' || ch == '['){
//                 s.push(ch);
//             }
//             // 🔹 Closing bracket
//             else {
//                 if(s.isEmpty()){
//                     return false;
//                 }

//                 if((s.peek() == '(' && ch == ')') ||
//                    (s.peek() == '{' && ch == '}') ||
//                    (s.peek() == '[' && ch == ']')){
//                     s.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }

//         return s.isEmpty();
//     }

//     public static void main(String[] args) {
//         String str = "({})[]";
//         System.out.println(isvalid(str));
//     }
// }



// dublicate parentheses

import java.util.Stack;

public class day31_Stack_2 {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            // 🔹 Closing bracket
            if(ch == ')'){
                int count = 0;

                while(!s.isEmpty() && s.peek() != '('){
                    s.pop();
                    count++;
                }

                if(!s.isEmpty()) {
                    s.pop(); // remove '('
                }

                if(count < 1){
                    return true; // duplicate found
                }
            }
            // 🔹 Push everything else
            else{
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "(((a+b)+(c+d)))"; // true
        String str2 = "((a+b)+(c+d))";   // false

        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}