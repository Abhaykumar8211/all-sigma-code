// public class day32_QueueB {   //time complexicity 0(n)
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear;

//         Queue(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }

//         public static boolean isEmpty(){
//             return rear == -1;
//         }

//         // add o(1)
//         public static void add(int data){
//             if(rear == size-1){
//                 System.out.println("queue is full");
//                 return;
//             }
//             rear = rear+1;
//             arr[rear] = data;
//         }

//         // remove o(n)
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             int front = arr[0];
//             for(int i=0; i<rear; i++){
//                 arr[i] = arr[i+1];
//             }
//             rear = rear - 1;
//             return front;

//         }

//         // peek
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             return arr[0];
//         }

//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
        
//     }
    
// }


// public class day32_QueueB {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;

//         Queue(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;
//             front = -1;
//         }

//         public static boolean isEmpty(){
//             return rear == -1 && front == -1;
//         }

//         public static boolean isFull(){
//             return (rear+1)% size == front;
//         }

//         // add
//         public static void add(int data){
//             if(isFull()){
//                 System.out.println("queue is full");
//                 return;
//             }
//             // add
//             if(front == -1){
//                 front = 0;
//             }
//             rear = (rear+1)%size;
//             arr[rear] = data;
//         }

//         // remove
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             int result = arr[front];
            
//             // last el delete
//             if(rear == front){
//                 rear = front = -1;
//             }else{
//                 front = (front + 1)%size;
//             }
//             return result;

//         }

//         // peek
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             return arr[front];
//         }

//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(3);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
        
//     }
    
// }



//linkedList -------------------------------------------------------?
// public class day32_QueueB {

//     static class Node {
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Queue {
//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty(){
//             return head == null && tail == null;   // fixed (& → &&)
//         }

//         // add
//         public static void add(int data){
//             Node newNode = new Node(data);
//             if(head == null){
//                 head = tail = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;
//         }

//         // remove
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             int front = head.data;

//             if(tail == head){
//                 tail = head = null;
//             } else {
//                 head = head.next;
//             }
//             return front;
//         }

//         // peek
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue();

//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()) {   // fixed (missing q)
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }




// implentstion java framwork se -----------------------?  tc = O(1)
// import java.util.*;
// public class day32_QueueB {

//     public static void main(String[] args) {
//         // Queue q = new Queue();
//         // Queue<Integer> q = new LinkedList<>();
//         Queue<Integer> q = new ArrayDeque<>();

//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()) {   // fixed (missing q)
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



// Queue using 2 stack @@@

// import java.util.Queue;
// import java.util.Stack;

// public class day32_QueueB {
//     static class Queue{
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty(){
//             return s1.isEmpty();
//         }

//         // add  - O(n)
//         public static void add(int data){
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }
//             s1.push(data);

//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//         }

//         // remove 
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("queue empty");
//                 return -1;
//             }

//             return s1.pop();
//         }

//         // peek
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("queue empty");
//                 return -1;
//             }
//             return s1.peek();
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }
// }



// Stack using 2 Queue @@@

// Stack using 2 Queue @@@

// import java.util.LinkedList;
// import java.util.Queue;

// public class day32_QueueB {
//     static class Stack{
//         Queue<Integer> q1 = new LinkedList<>();
//         Queue<Integer> q2 = new LinkedList<>();

//         public boolean isEmpty(){
//             return q1.isEmpty() && q2.isEmpty();
//         }

//         public void push(int data){
//             if(!q1.isEmpty()){
//                 q1.add(data);
//             }else{
//                 q2.add(data);   // fixed
//             }
//         }

//         public int pop(){
//             if(isEmpty()){
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int top = -1;

//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top = q1.remove();
//                     if(q1.isEmpty()){
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             }else{
//                 while (!q2.isEmpty()) {
//                     top = q2.remove();
//                     if(q2.isEmpty()){
//                         break;
//                     }
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }

//         public int peek(){
//             if(isEmpty()){
//                 System.out.println("empty stack");
//                 return -1;
//             }

//             int top = -1;

//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top = q1.remove();
//                     q2.add(top);
//                 }
//             }else{
//                 while (!q2.isEmpty()) {
//                     top = q2.remove();
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();

//         s.push(1);   // fixed
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());   // fixed
//             s.pop();
//         }
//     }
// }



// first non - repeating letter in a stream of character  -----------------------?
// import java.util.*;

// public class day32_QueueB {

//     public static void printNonRepeating(String str){
//         int freq[] = new int[26];  //'a'-'z'
//         Queue<Character> q = new LinkedList<>();

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch - 'a']++;

//             // yeh loop andar hona chahiye
//             while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
//                 q.remove();
//             }

//             if(q.isEmpty()){
//                 System.out.print(-1 + " ");
//             } else {
//                 System.out.print(q.peek() + " ");
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         String str = "aabccxb";
//         printNonRepeating(str);
//     }
// }



// interleave 2 halves of a Queue (even length)  ------------------------?

// import java.util.LinkedList;
// import java.util.Queue;

// public class day32_QueueB {
//     public static void interLeave(Queue<Integer> q){
//         Queue<Integer> firstHalf = new LinkedList<>();
//         int size = q.size();

//        for(int i=0; i<size/2; i++){
//            firstHalf.add(q.remove());
//        }
//        while(!firstHalf.isEmpty()){
//         q.add(firstHalf.remove());
//         q.add(q.remove());
//        }

//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
    
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);
//         interLeave(q);

//         while (!q.isEmpty()) {
//             System.out.print(q.remove()+" ");
            
//         }
//         System.out.println();

//     }
// }



//Queue reversel --------------------------------------------------?

// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Stack;

// public class day32_QueueB {
//     public static void revers(Queue<Integer> q){
//         Stack<Integer> s = new Stack<>();

//         while(!q.isEmpty()){
//             s.push(q.remove());

//         }

//         while (!s.isEmpty()) {
//             q.add(s.pop());
            
//         }

        
//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         revers(q);

//         while (!q.isEmpty()) {
//             System.out.print(q.remove()+" ");
            
//         }
//         System.out.println();
//     }
// }



// we are using Deque ++++++++++++++++++++++++++++++++++++++++++?

// import java.util.Deque;
// import java.util.LinkedList;

// public class day32_QueueB {

//     public static void main(String[] args) {
//         Deque<Integer> deque = new LinkedList<>();
//         deque.addFirst(2); // 2
//         deque.addFirst(3);  // 3 2
//         deque.addLast(4);   // 3 2 4
//         deque.removeFirst(); // 2 4
//         deque.removeLast();  // 2
//         deque.addFirst(1);   // 1 2
//         deque.addLast(3);    // 1 2 3
        

//         System.out.println(deque);
//         System.out.println("first el = "+deque.getFirst());
//         System.out.println("last el = "+deque.getLast());



//     }
// }



// stack & Queue using Deque ---------------------------------------?

// import java.util.Deque;
// import java.util.LinkedList;

// public class day32_QueueB {
//     static class Stack {
//         Deque<Integer> deque = new LinkedList<>();

//         public void push(int data){
//             deque.addLast(data);
//         }

//         public int pop(){
//             return deque.removeLast();
//         }

//         public int peek(){
//             return deque.getLast();
                         
//         }

//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         System.out.println("peek = "+s.peek());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//     }
// }




// stack & Queue using Deque ---------------------------------------?

import java.util.Deque;
import java.util.LinkedList;

public class day32_QueueB {
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek = "+ q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}


