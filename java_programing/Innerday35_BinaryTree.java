// public class day35_BinaryTree {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static int height(Node root){
//         if(root == null){
//             return 0;
//         }

//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh, rh) + 1;
//     }

//     public static int diameter2(Node root){  //o(n^2)
//         if(root == null){
//             return 0;
//         }

//         int leftDian = diameter2(root.left);
//         int leftHt = height(root.left);
//         int rightDiam = diameter2(root.right);
//         int rightHt = height(root.right);


//         int sellfDian = leftHt + rightHt +  1;
//         return Math.max(sellfDian, Math.max(leftDian, rightDiam));

//     }

//     static class Info{
//         int daim;
//         int ht;

//         public Info(int daim, int ht){
//             this.daim = daim;
//             this.ht = ht;
//         }
//     }
//     public static Info diameter(Node root){
//         if(root == null){
//             return new Info(0, 0);
//         }

//         Info leftInfo = diameter(root.left);
//         Info rightInfo = diameter(root.right);

//         int daim = Math.max(Math.max(leftInfo.daim, rightInfo.daim) , leftInfo.ht + rightInfo.ht + 1);
//         int ht = Math.max(leftInfo.ht , rightInfo.ht) + 1;

//         return new Info(daim, ht);

//     }

//     public static void main(String args[]) {

//         /*
//                  1
//                /   \
//               2     3
//              / \   / \
//             4   5 6   7
//         */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);
//         // System.out.println(hieght(root));   print -> 3
//         // System.out.println(count(root));    print -> 7
//         System.out.println(diameter(root).daim);
//         System.out.println(diameter(root).ht);
        
//     }
// }
    


// subtree of another tree --------------------------------------------?
// public class day35_BinaryTree {
//     public static class Node{
//         int data;
//         Node right;
//         Node left;

//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static boolean isIdentical(Node node, Node subRoot){
//         if(node == null && subRoot == null){
//             return true;
//         }else if(node == null || subRoot == null || node.data != subRoot.data){
//             return false;
//         }

//         if(!isIdentical(node.left, subRoot.left)){
//             return false;
//         }
//         if(!isIdentical(node.right, subRoot.right)){
//             return false;
//         }
//         return true;
//     }

//     public static boolean isSubtree(Node root, Node subRoot){
//         if(root == null){
//             return false;
//         }
//         if(root.data == subRoot.data){
//             if(isIdentical(root, subRoot)){
//                 return true;
//             }
//         }

//         // boolean leftAns = issubtree(root.left, subRoot);
//         // boolean rightAns = issubtree(root.right, subRoot);

//         return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//     }

//     public static void main(String[] args) {
//         /*
//                  1
//                /   \
//               2     3
//              / \   / \
//             4   5 6   7
//         */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);
        
//         /*
//               2 
//              / \   
//             4   5 
//         */

//         Node subroot = new Node(2);
//         subroot.left = new Node(4);
//         subroot.right = new Node(5);

//         System.err.println(isSubtree(root, subroot));
//     }
// }




import java.util.*;
public class Innerday35_BinaryTree {
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
    static class Info{
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        // level Order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }

                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
               }
            }
        }

        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);

    }

    
}