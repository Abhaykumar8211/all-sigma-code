// public class day38_BST2 {
//     public static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     public static void preorder(Node root){
//         if(root == null){
//             return;
//         }

//         System.out.print(root.data+" ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public static Node createBST(int arr[], int st, int end){
//         if(st > end){
//             return null;
//         }

//         int mid = (st+end)/2;
//         Node root = new Node(arr[mid]);
//         root.left = createBST(arr, st, mid-1);
//         root.right = createBST(arr, mid+1, end);

//         return root;
//     }
    
//     public static void main(String[] args) {
//         int arr[] = {3, 5, 6, 8, 10, 11, 12};

//         /*
//                 8
//                / \
//               5   11
//              / \  / \
//             3  6  10 12
//             expected BST
//         */

//             Node root = createBST(arr, 0, arr.length - 1);
//             preorder(root);
//     }
    
// }




// convert BST to balance BST  -----------------------------------------------?

// import java.util.*;

// public class day38_BST2 {
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node (int data){
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     public static void preorder(Node root){
//         if(root == null){
//             return;
//         }

//         System.err.print(root.data+" ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public static void getinorder(Node root, ArrayList<Integer> inorder){
//         if(root == null){
//             return;
//         }

//         getinorder(root.left, inorder);
//         inorder.add(root.data);
//         getinorder(root.right, inorder);
//     }

//     public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
//         if(st > end){
//             return null;
//         }

//         int mid = (st+end)/2;
//         Node root = new Node(inorder.get(mid));
//         root.left = createBST(inorder, st, mid-1);
//         root.right = createBST(inorder, mid+1, end);
//         return root;
//     }

//     public static Node balanceBST(Node root) {
//         //inorder swq - o(n)
//         ArrayList<Integer> inorder = new ArrayList<>();
//         getinorder(root, inorder);

//         //sorted inorder -> balance BSt  - o(n)
//         root = createBST(inorder, 0, inorder.size()-1);
//         return root;
//     }

//     public static void main(String[] args) {
//          /*
//                 8
//                / \
//               6   10
//              /      \
//             5        11
//            /           \
//           3             12

//         given BST (unbalanced)
//         */

//         Node root = new Node(8);
//         root.left = new Node(6);
//         root.left.left = new Node(5);
//         root.left.left.left = new Node(3);

//         root.right = new Node(10);
//         root.right.right = new Node(11);
//         root.right.right.right = new Node(12);

//         /*
//                8
//              /   \
//             5     11
//            / \   /  \
//           3   6 10  12

//           Balanced BST
//         */

//           root = balanceBST(root);
//           preorder(root);
//     }
// }




// size of Largest BST in BT ------------------------------------------?

public class day38_BST2 {

    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static int maxBST = 0;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info left = largestBST(root.left);
        Info right = largestBST(root.right);

        int size = left.size + right.size + 1;
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        // BST condition
        if (left.isBST && right.isBST &&
            root.data > left.max &&
            root.data < right.min) {

            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {

        /*
                    50
                   /  \
                 30    60
                / \   /  \
               5  20 45   70
                         /   \
                       65     80

        Given Binary Tree
        */

        Node root = new Node(50);

        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        /*
                60
               /  \
             45    70
                   / \
                 65   80

        Expected Largest BST (size = 5)
        */

        largestBST(root);

        System.out.println("Largest BST size = " + maxBST);
    }
}