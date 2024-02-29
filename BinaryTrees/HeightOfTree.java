package BinaryTrees;

public class HeightOfTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }
    public static  int totalNodes(Node root){
        if(root == null){
            return 0;
        }
        int lf = totalNodes(root.left);
        int rt = totalNodes(root.right);
        return  lf + rt + 1;
    }
    public static int sumOfNodes(Node root){
        if(root == null) {
            return 0;
        }
        int lt = sumOfNodes(root.left);
        int rt = sumOfNodes(root.right);
        return lt + rt + root.data;


    }
    public static void main(String[] args) {
        /*
         *             1
         *           /  \
         *          2    3
         *         / \  / \
         *        4   5 6  7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node( 5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));

        System.out.println(totalNodes(root));

        System.out.println(sumOfNodes(root));
    }

}
