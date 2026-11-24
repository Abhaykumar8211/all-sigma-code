// public class day29_LinkedList {

//     // Node class
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static Node head;

//     // Function to detect cycle
//     public static boolean isCycle() {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;          // +1 step
//             fast = fast.next.next;     // +2 step

//             if (slow == fast) {
//                 return true;           // cycle exists
//             }
//         }

//         return false;                  // no cycle
//     }


//     public static void removeCycle() {
//     // detect cycle
//     Node slow = head;
//     Node fast = head;
//     boolean cycle = false;

//     while (fast != null && fast.next != null) {
//         slow = slow.next;
//         fast = fast.next.next;

//         if (fast == slow) {
//             cycle = true;
//             break;
//         }
//     }

//     // if no cycle
//     if (cycle == false) {
//         return;
//     }

//     // find meeting point
//     slow = head;
//     Node prev = null; // last node

//     while (slow != fast) {
//         prev = fast;
//         slow = slow.next;
//         fast = fast.next;
//     }

//     // remove cycle -> last.next = null
//     prev.next = null;
// }

//     public static void main(String[] args) {
//         head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = head;
        
//         System.out.println(isCycle());   // true
//         removeCycle();
//         System.out.println(isCycle());
//     }
// }


// start frame 

// import java.util.LinkedList;

// public class day29_LinkedList {

//     public static void main(String[] args) {
//         LinkedList<Integer> ll = new LinkedList<>();

//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addFirst(3);

//         System.out.println(ll);
        
//         ll.removeLast();
//         System.out.println(ll);
//     }
// }

// import java.util.LinkedList;

// public class day29_LinkedList{

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static Node head;

//     // Print LinkedList
//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // Add First
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }

//     // Find Mid
//     private Node getMid(Node head) {
//         Node slow = head;
//         Node fast = head.next;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     // Merge
//     private Node merge(Node head1, Node head2) {
//         Node mergedLL = new Node(-1);
//         Node temp = mergedLL;

//         while (head1 != null && head2 != null) {
//             if (head1.data <= head2.data) {
//                 temp.next = head1;
//                 head1 = head1.next;
//             } else {
//                 temp.next = head2;
//                 head2 = head2.next;
//             }
//             temp = temp.next;
//         }

//         while (head1 != null) {
//             temp.next = head1;
//             head1 = head1.next;
//             temp = temp.next;
//         }

//         while (head2 != null) {
//             temp.next = head2;
//             head2 = head2.next;
//             temp = temp.next;
//         }

//         return mergedLL.next;
//     }

//     // Merge Sort
//     public Node mergeSort(Node head) {
//         if (head == null || head.next == null) {
//             return head;
//         }

//         Node mid = getMid(head);
//         Node rightHead = mid.next;
//         mid.next = null;

//         Node newLeft = mergeSort(head);
//         Node newRight = mergeSort(rightHead);

//         return merge(newLeft, newRight);
//     }

//     public static void main(String[] args) {
//         day29_LinkedList ll = new day29_LinkedList();

//         ll.addFirst(1);
//         ll.addFirst(2);
//         ll.addFirst(3);
//         ll.addFirst(4);
//         ll.addFirst(5);

//         System.out.println("Before Sorting:");
//         ll.print();

//         head = ll.mergeSort(head);

//         System.out.println("After Sorting:");
//         ll.print();
//     }
// }



// // for Zig Zag?
// public class day29_LinkedList {

//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public void addLast(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }

//         System.out.println("null");
//     }

//     public void zigZag() {
//         Node slow = head;
//         Node fast = head.next;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         Node mid = slow;

//         Node curr = mid.next;
//         mid.next = null;
//         Node prev = null;
//         Node next;

//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         Node left = head;
//         Node right = prev;
//         Node nextL, nextR;

//         while (left != null && right != null) {
//             nextL = left.next;
//             left.next = right;

//             nextR = right.next;
//             right.next = nextL;

//             left = nextL;
//             right = nextR;
//         }
//     }

//     public static void main(String[] args) {

//         day29_LinkedList ll = new day29_LinkedList();

//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addLast(3);
//         ll.addLast(4);
//         ll.addLast(5);

//         ll.print();

//         ll.zigZag();

//         ll.print();
//     }
// }




// Double LinkedList
public class day29_LinkedList {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // remove -remove last 
    public int removeFirst(){
        if(head == null){
            System.out.println("Dll is empy");
            return Integer.MIN_VALUE; 
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }



    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public static void main(String[] args) {
         day29_LinkedList dll = new day29_LinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        // dll.print();
        // System.out.println(dll.size);

        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);


        // for revers
        dll.print();
        dll.reverse();
        dll.print();
    
    }
}