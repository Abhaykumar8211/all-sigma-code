// //  question (1)Palindrome Linked List -----------------------------------?
// public class day30_31_Stack {

//     // Node class
//     static class Node {
//         char data;
//         Node next;

//         Node(char data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Palindrome function
//     public static boolean ispalindrome(Node head) {
//         if (head == null || head.next == null) {
//             return true;
//         }

//         // Step 1: Find middle
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         // Step 2: Reverse second half
//         Node prev = null;
//         Node curr = slow;

//         while (curr != null) {
//             Node next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         // Step 3: Compare
//         Node left = head;
//         Node right = prev;

//         while (right != null) {
//             if (left.data != right.data) {
//                 return false;
//             }
//             left = left.next;
//             right = right.next;
//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         // A -> B -> C -> B -> A
//         Node head = new Node('A');
//         head.next = new Node('B');
//         head.next.next = new Node('C');
//         head.next.next.next = new Node('B');
//         head.next.next.next.next = new Node('A');

//         if (ispalindrome(head)) {
//             System.out.println("Yes it is palindrome");
//         } else {
//             System.out.println("Not a palindrome");
//         }
//     }
// }


// Palindrome Linked List using Stac----------------------------?(same question)
// import java.util.*;

// public class day30_31_Stack {

//     // Node class
//     static class Node {
//         char data;
//         Node next;

//         Node(char data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Function using Stack (Framework)
//     public static boolean isPalindrome(Node head) {
//         Stack<Character> st = new Stack<>();

//         Node temp = head;

//         // Step 1: Push all elements into stack
//         while (temp != null) {
//             st.push(temp.data);
//             temp = temp.next;
//         }

//         // Step 2: Compare while popping
//         temp = head;
//         while (temp != null) {
//             if (temp.data != st.pop()) {
//                 return false;
//             }
//             temp = temp.next;
//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         // A -> B -> C -> B -> A
//         Node head = new Node('A');
//         head.next = new Node('B');
//         head.next.next = new Node('C');
//         head.next.next.next = new Node('B');
//         head.next.next.next.next = new Node('A');

//         if (isPalindrome(head)) {
//             System.out.println("Yes it is Palindrome");
//         } else {
//             System.out.println("Not a Palindrome");
//         }
//     }
// }



// question(2) Simplify Path (Unix Style) -------------------------------?
// import java.util.*;

// class day30_31_Stack {

//     public static void main(String[] args) {
        
//         // Sample Input 1
//         String path1 = "/apnacollege/";
//         System.out.println(simplify(path1));

//         // Sample Input 2
//         String path2 = "/a/..";
//         System.out.println(simplify(path2));
//     }

//     static String simplify(String A) {

//         Stack<String> st = new Stack<>();

//         for (int i = 0; i < A.length(); i++) {

//             String dir = "";

//             // skip '/'
//             while (i < A.length() && A.charAt(i) == '/')
//                 i++;

//             // get directory name
//             while (i < A.length() && A.charAt(i) != '/') {
//                 dir += A.charAt(i);
//                 i++;
//             }

//             if (dir.equals("..")) {
//                 if (!st.isEmpty())
//                     st.pop();
//             } 
//             else if (dir.equals(".") || dir.length() == 0) {
//                 continue;
//             } 
//             else {
//                 st.push(dir);
//             }
//         }

//         // build result
//         String res = "/";
//         Stack<String> st1 = new Stack<>();

//         while (!st.isEmpty())
//             st1.push(st.pop());

//         while (!st1.isEmpty()) {
//             res += st1.pop();
//             if (!st1.isEmpty())
//                 res += "/";
//         }

//         return res;
//     }
// }



// Decode String ka complete code  -------------------------------------?
// import java.util.*;
// public class day30_31_Stack {
//     public static String decodeString(String s){
//         Stack<Integer> countStack = new Stack<>();
//         Stack<String> strStack = new Stack<>();

//         String curr = "";
//         int num = 0;

//         for(int i= 0; i<s.length(); i++){
//             char ch = s.charAt(i);

//             if(Character.isDigit(ch)){
//                 num = num*10+(ch - '0');
//             }
//             else if (ch == '['){
//                 countStack.push(num);
//                 strStack.push(curr);

//                 num = 0;
//                 curr = "";
//             }
//             else if(ch == ']'){
//                 int repeat = countStack.pop();
//                 String prev = strStack.pop();

//                 String temp = "";
//                 for(int j=0; j<repeat; j++){
//                     temp += curr;
//                 }
//                 curr = prev + temp;
//             }
//             else{
//                 curr += ch;
//             }

//         }
//         return curr;
//     }

//     public static void main(String[] args) {
//         String s1 = "2[cv]";
//         String s2 = "3[b2[v]]";

//         System.out.println(decodeString(s1));
//         System.out.println(decodeString(s2));
//     }
// }




// Stack – Trapping Rain Water ----------------------------------------?
import java.io.*;
import java.util.*;

class day30_31_Stack {

    public static int maxWater(int[] height) {

        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && height[stack.peek()] < height[i]) {

                int pop_height = height[stack.peek()];
                stack.pop();

                if (stack.isEmpty())
                    break;

                int distance = i - stack.peek() - 1;

                int min_height = Math.min(height[stack.peek()], height[i]) - pop_height;

                ans += distance * min_height;
            }

            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};

        System.out.print(maxWater(arr));
    }
}