// for solving stack using ArrayList 

// import java.util.*;
// public class day30_Stacks {
//     static class stack {
//         static ArrayList<Integer> list = new ArrayList<>();
//         public static boolean isempty(){
//             return list.size() == 0;
//         }
//         // push
//         public static void push(int data){
//             list.add(data);
//         }

//         // pop
//         public static int pop(){
//             if(isempty()){
//                 return -1;
//             }
//             int top = list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }

//         // peek
//         public static int peek(){
//             if(isempty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }
//     }

//     public static void main(String[] args) {
//         stack s = new stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isempty()){
//             System.out.println(s.peek());
//             s.pop();;
//         }
//     }
    
// }



// for solving stack using linkedList
// public class day30_Stacks {

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Stack {
//         Node head = null;

//         public boolean isEmpty() {
//             return head == null;
//         }

//         // push
//         public void push(int data) {
//             Node newNode = new Node(data);

//             if (isEmpty()) {
//                 head = newNode;
//                 return;
//             }

//             newNode.next = head;
//             head = newNode;
//         }

//         // pop
//         public int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }

//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         // peek
//         public int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }

//             return head.data;
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();

//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }



// simple and easy creat and explianation karane ke liye code
// import java.util.*;
// public class day30_Stacks {

//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }



// lecture question number 2, import java.util.*;

// import java.util.*;
// public class day30_Stacks {

//     // push at bottom
//     public static void pushBottom(Stack<Integer> s, int data) {
//         if (s.isEmpty()) {
//             s.push(data);
//             return;
//         }

//         int top = s.pop();
//         pushBottom(s, data);
//         s.push(top);
//     }

//     // reverse string using stack
//     public static String reverseString(String str) {
//         Stack<Character> s = new Stack<>();
//         int idx = 0;

//         // push all characters
//         while (idx < str.length()) {
//             s.push(str.charAt(idx));
//             idx++;
//         }

//         // pop and build reversed string
//         StringBuilder result = new StringBuilder();
//         while (!s.isEmpty()) {
//             char curr = s.pop();
//             result.append(curr);
//         }

//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String str = "abc";

//         String ans = reverseString(str);
//         System.out.println("Reversed String = " + ans);
//     }
// }

// import java.util.Stack;

// public class day30_Stacks {
//     public static void stockspam(int stock[], int span[]){
//         Stack<Integer> s = new Stack<>();
//         span[0] = 1;
//         s.push(0);

//         for(int i=1; i<stock.length; i++){
//             int currprice = stock[i];
//             while(!s.isEmpty() && currprice > stock[s.peek()]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 span[i]= i+1;
//             }
//             else{
//                 int prevHigh = s.peek();
//                 span[i] = i-prevHigh;
//             }
//             s.push(i);
//         }
//     }


//     public static void main(String[] args) {
//         int stock[] = {100, 80, 60, 70, 60, 85, 100};
//         int span[] = new int[stock.length];
//         stockspam(stock, span);

//         for(int i=0; i<span.length; i++){
//             System.out.println(span[i]+"");
//         }


        
//     }
// }




// Next greater code important

import java.util.Stack;

public class day30_Stacks {

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            // while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            
            // 2 if-else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }

            // 3 push in s
            s.push(i);
        }

        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i] +" ");
        }
        System.out.println();
    }
}

