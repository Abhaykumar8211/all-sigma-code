// // Kth levels ---------------------------------------------------?
// import java.util.*;
// public class day36_BinaryTree {
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public  Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null; 

//         }
        
//     }

//     public static void klevel(Node root, int level, int k) {
//         if(root == null){
//             return;
//         }

//         if(level == k){
//             System.out.print(root.data+" ");
//             return;
//         }

//         klevel(root.left, level+1, k);
//         klevel(root.right, level+1, k);
//     }
//     public static void main(String[] args) {
//         /*
//                  1
//                /   \
//               2     3
//              / \   / \
//             4   5 6   7
//         */
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.right = new Node(7);
//        root .right.left = new Node(6);
       
//        int k = 2;
//        klevel(root, 1, k);
        
//     }
    
// }





// // Lowest common ancestor [approac -> 2] o(n)--------------------------------------------------------?

// import java.lang.reflect.Array;
// import java.util.ArrayList;

// public class day36_BinaryTree {
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }

//     }

//     public static boolean getpath(Node root, int n, ArrayList<Node> path){
//         if(root == null){
//             return false;
//         }

//         path.add(root);

//         if(root.data == n){
//             return true;
//         }

//         boolean foundLeft = getpath(root.left, n, path);
//         boolean foundRight = getpath(root.right, n, path);

//         if(foundLeft || foundRight){
//             return true;
//         }

//         path.remove(path.size()-1);
//         return false;

//     }

//     public static Node lca(Node root, int n1, int n2){
//         ArrayList<Node> path1 = new ArrayList<>();
//         ArrayList<Node> path2 = new ArrayList<>();

//         getpath(root, n1, path1);
//         getpath(root, n2, path2);

//         // last common ancestor
//         int i = 0;
//         for(;i<path1.size() && i<path2.size(); i++){
//             if(path1.get(i) != path2.get(i)){
//                 break;
//             }
//         }

//         // last equal node -> i-1th
//         Node lca = path1.get(i-1);
//         return lca;
//     }

//     public static void main(String[] args) {
//          /*
//                  1
//                /   \
//               2     3
//              / \   / \
//             4   5 6   7
//         */
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);

//     //    int n1 = 4, n2 = 5;  -> 2
//       int n1 = 4, n2 = 7;    // -> 1
       
//        System.out.println(lca(root, n1, n2).data);

//     }
// }




// Lowest common ancestor[approac -> 2]  o(n) --------------------------------------------------------?

// import java.lang.reflect.Array;
// import java.util.ArrayList;

// public class day36_BinaryTree {
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }

//     }

//     public static Node lca2(Node root, int n1, int n2){
//         if(root == null || root.data == n1 || root.data == n2){
//             return root;

//         }

//         Node leftLca = lca2(root.left, n1, n2);
//         Node rightLca = lca2(root.right, n1, n2);

//         // leftLca = val rightLca = null
//         if(rightLca == null){
//             return leftLca;
//         }
//         if(leftLca == null){
//             return rightLca;
//         }
//         return root;
//     }
    


//     public static void main(String[] args) {
//          /*
//                  1
//                /   \
//               2     3
//              / \   / \
//             4   5 6   7
//         */
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);

//     //    int n1 = 4, n2 = 5;  -> 2
//       int n1 = 4, n2 = 7;    // -> 1
       
//        System.out.println(lca2(root, n1, n2).data);

//     }
// }




// Min Distance between nodes -------------------------------------?
// import java.lang.reflect.Array;
// import java.util.ArrayList;

// public class day36_BinaryTree {
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }

//     }

//     public static Node lca2(Node root, int n1, int n2){
//         if(root == null || root.data == n1 || root.data == n2){
//             return root;

//         }

//         Node leftLca = lca2(root.left, n1, n2);
//         Node rightLca = lca2(root.right, n1, n2);

//         // leftLca = val rightLca = null
//         if(rightLca == null){
//             return leftLca;
//         }
//         if(leftLca == null){
//             return rightLca;
//         }
//         return root;
//     }

//     public static int lcaDist(Node root, int n){
//         if(root == null){
//             return -1;
//         }

//         if(root.data == n){
//             return 0;
//         }

//         int leftDist = lcaDist(root.left, n);
//         int rightDist = lcaDist(root.right, n);

//         if(leftDist == -1 && rightDist == -1){
//             return -1;
//         }else if(leftDist == -1){
//             return rightDist + 1;
//         }else{
//             return leftDist+1;
//         }
//     }

//     public static int minDist(Node root, int n1, int n2){
//         Node lca = lca2(root, n1, n2);
//         int dist1 = lcaDist(lca, n1);
//         int dist2 = lcaDist(lca, n2);

//         return dist1 + dist2;

//     }
    


//     public static void main(String[] args) {
//          /*
//                  1
//                /   \
//               2     3
//              / \   / \
//             4   5 6   7
//         */
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);

//     //    int n1 = 4, n2 = 5;  -> 2
//       int n1 = 4, n2 = 6;    // -> 4
       
//        System.out.println(minDist(root, n1, n2));

//     }
// }




// Kth Ancestor of mode ----------------------------------------?
// import java.lang.reflect.Array;
// import java.util.ArrayList;

// public class day36_BinaryTree {
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }

//     }

//     public static int KAncestor(Node root, int n, int k){
//         if(root == null){
//             return -1;
//         }
//         if(root.data == n){
//             return 0;
//         }

//         int leftDist = KAncestor(root.left, n, k);
//         int rightDist = KAncestor(root.right, n, k);

//         if(leftDist == -1 && rightDist == -1){
//             return -1;
//         }

//         int max = Math.max(leftDist, rightDist);
//         if(max+1 == k){
//             System.out.println(root.data);
//         }
//         return max+1;
//     }

//     public static void main(String[] args) {
//          /*
//                  1
//                /   \
//               2     3
//              / \   / \
//             4   5 6   7
//         */
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);

//     //    int n = 4, k = 1 //  -> 2
//       int n = 5, k = 2;    // -> 1
       
//        KAncestor(root, n, k);

//     }
// }






// Transfor to sum tree --------------------------------------------?
import java.util.ArrayList;

public class day36_BinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int transform(Node root){
        if(root == null){
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;
        return data;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.err.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
         /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7

            expected sum tree is
                 
                 27
               /   \
              9     13
             / \   / \
            0   0 0   0
        */
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);

       transform(root);
       preorder(root);

    }
}