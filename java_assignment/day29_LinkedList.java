// public class day29_LinkedList {

//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node getIntersection(Node head1, Node head2) {
//         if (head1 == null || head2 == null) return null;

//         Node p1 = head1;
//         Node p2 = head2;

//         while (p1 != p2) {
//             p1 = (p1 == null) ? head2 : p1.next;
//             p2 = (p2 == null) ? head1 : p2.next;
//         }

//         return p1;
//     }

//     public static void main(String[] args) {

//         // common part
//         Node common = new Node(6);
//         common.next = new Node(7);

//         // list 1: 1 -> 2 -> 3 -> 6 -> 7
//         Node head1 = new Node(1);
//         head1.next = new Node(2);
//         head1.next.next = new Node(3);
//         head1.next.next.next = common;

//         // list 2: 4 -> 5 -> 6 -> 7
//         Node head2 = new Node(4);
//         head2.next = new Node(5);
//         head2.next.next = common;

//         Node ans = getIntersection(head1, head2);

//         if (ans != null) {
//             System.out.println("Intersection Node: " + ans.data);
//         } else {
//             System.out.println("No Intersection");
//         }
//     }
// }



public class day29_LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNafterM(int M, int N) {
        Node curr = head;

        while (curr != null) {

            // skip M-1 nodes
            for (int i = 1; i < M && curr != null; i++) {
                curr = curr.next;
            }

            if (curr == null) return;

            // start deleting from next node
            Node temp = curr.next;

            for (int i = 0; i < N && temp != null; i++) {
                temp = temp.next;
            }

            // connect
            curr.next = temp;

            // move curr आगे
            curr = temp;
        }
    }

    public static void main(String[] args) {

        day29_LinkedList ll = new day29_LinkedList();

        // Example: 1->2->3->4->5->6->7->8
        for (int i = 1; i <= 8; i++) {
            ll.addLast(i);
        }

        ll.print();

        ll.deleteNafterM(2, 2);

        ll.print();
    }
}
