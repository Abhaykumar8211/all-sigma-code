// public class day36_BinaryTree {

//     static class Node {
//         int data;
//         Node left;
//         Node right;
//     }

//     // create node
//     static Node newNode(int data) {
//         Node temp = new Node();
//         temp.data = data;
//         temp.left = temp.right = null;
//         return temp;
//     }

//     // check univalued tree
//     static boolean isUnivalTree(Node root) {

//         if (root == null)
//             return true;

//         if (root.left != null && root.data != root.left.data)
//             return false;

//         if (root.right != null && root.data != root.right.data)
//             return false;

//         return isUnivalTree(root.left) && isUnivalTree(root.right);
//     }

//     public static void main(String[] args) {

//         Node root = newNode(1);
//         root.left = newNode(1);
//         root.right = newNode(2);   // different value

//         if (isUnivalTree(root)) {
//             System.out.println("YES");
//         } else {
//             System.out.println("NO");
//         }
//     }
// }



// question - 2 ----------------------------------------?
// public class day36_BinaryTree {

//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             left = right = null;
//         }
//     }

//     /*
//             Original Tree
//                   1
//                 /   \
//                2     3
//               / \   / \
//              4   5 6   7

//             Mirror Tree
//                   1
//                 /   \
//                3     2
//               / \   / \
//              7   6 5   4
//     */

//     // invert tree
//     static Node invertTree(Node root) {

//         if (root == null)
//             return null;

//         Node temp = root.left;
//         root.left = root.right;
//         root.right = temp;

//         invertTree(root.left);
//         invertTree(root.right);

//         return root;
//     }

//     // check if two trees are same
//     static boolean isSame(Node a, Node b) {

//         if (a == null && b == null)
//             return true;

//         if (a == null || b == null)
//             return false;

//         return (a.data == b.data)
//                 && isSame(a.left, b.left)
//                 && isSame(a.right, b.right);
//     }

//     public static void main(String[] args) {

//         // Original tree
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         // Expected mirror tree (as in question)
//         Node mirror = new Node(1);
//         mirror.left = new Node(3);
//         mirror.right = new Node(2);
//         mirror.left.left = new Node(7);
//         mirror.left.right = new Node(6);
//         mirror.right.left = new Node(5);
//         mirror.right.right = new Node(4);

//         // invert original
//         Node inverted = invertTree(root);

//         // compare
//         if (isSame(inverted, mirror)) {
//             System.out.println("YES");
//         } else {
//             System.out.println("NO");
//         }
//     }
// }





// Question 3: Delete Leaf Nodes with Value X ------------------------?
// public class day36_BinaryTree {

//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             left = right = null;
//         }
//     }

//     /*
//             Original Tree
//                   1
//                  / \
//                 3   3
//                / \
//               3   2

//             Delete leaf nodes with value = 3

//             Final Tree
//                   1
//                  /
//                 3
//                  \
//                   2
//     */

//     static Node deleteLeaf(Node root, int x) {

//         if (root == null)
//             return null;

//         root.left = deleteLeaf(root.left, x);
//         root.right = deleteLeaf(root.right, x);

//         // delete if leaf node and value == x
//         if (root.left == null && root.right == null && root.data == x) {
//             return null;
//         }

//         return root;
//     }

//     // inorder print
//     static void inorder(Node root) {
//         if (root == null)
//             return;
//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }

//     public static void main(String[] args) {

//         Node root = new Node(1);
//         root.left = new Node(3);
//         root.right = new Node(3);
//         root.left.left = new Node(3);
//         root.left.right = new Node(2);

//         int x = 3;

//         root = deleteLeaf(root, x);

//         inorder(root);
//     }
// }





// question -4 ------------------------------------------?
import java.util.HashMap;

// public class day36_BinaryTree {

//     static HashMap<String, Integer> map;

//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             left = right = null;
//         }
//     }

//     /*
//             Given Tree:

//                   1
//                 /   \
//                4     3
//                     / \
//                    3   4
//                   /
//                  3

//         Duplicate Subtrees:
//         - Subtree with root 4
//         - Subtree with root 3

//         Output: 4 3
//     */

//     static String inorder(Node root) {

//         if (root == null)
//             return "";

//         String str = "(";

//         str += inorder(root.left);
//         str += root.data;
//         str += inorder(root.right);

//         str += ")";

//         // print duplicate subtree root
//         if (map.get(str) != null && map.get(str) == 1) {
//             System.out.print(root.data + " ");
//         }

//         if (map.containsKey(str))
//             map.put(str, map.get(str) + 1);
//         else
//             map.put(str, 1);

//         return str;
//     }

//     static void findDuplicate(Node root) {
//         map = new HashMap<>();
//         inorder(root);
//     }

//     public static void main(String[] args) {

//         Node root = new Node(1);

//         root.left = new Node(4);

//         root.right = new Node(3);
//         root.right.left = new Node(3);
//         root.right.right = new Node(4);

//         root.right.left.left = new Node(3);

//         findDuplicate(root);
//     }
// }



// question 5 -_________________________________________________?
public class day36_BinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static int maxSum = Integer.MIN_VALUE;

    /*
        Input 1:
              4
             / \
            2   7

        Output: 13  (2 + 4 + 7)


        Input 2:
                -10
                /  \
               9    20
                   / \
                  15  7

        Output: 42  (15 + 20 + 7)
    */

    static int maxPath(Node root) {

        if (root == null)
            return 0;

        // left and right max path
        int left = Math.max(0, maxPath(root.left));
        int right = Math.max(0, maxPath(root.right));

        // update global max
        maxSum = Math.max(maxSum, left + right + root.data);

        // return max path including current node
        return Math.max(left, right) + root.data;
    }

    public static void main(String[] args) {

        // -------- Input 1 --------
        Node root1 = new Node(4);
        root1.left = new Node(2);
        root1.right = new Node(7);

        maxSum = Integer.MIN_VALUE;
        maxPath(root1);
        System.out.println("Output1: " + maxSum); // 13


        // -------- Input 2 --------
        Node root2 = new Node(-10);
        root2.left = new Node(9);
        root2.right = new Node(20);
        root2.right.left = new Node(15);
        root2.right.right = new Node(7);

        maxSum = Integer.MIN_VALUE;
        maxPath(root2);
        System.out.println("Output2: " + maxSum); // 42
    }
}