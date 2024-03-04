package BinaryTrees;

public class DiameterOfTree {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
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
    public static int diameter2(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameter2(root.left);
        int leftHeight = height(root.left);
        int rightDiam = diameter2(root.right);
        int rightHeight = height(root.right);

        int selfDiam = leftHeight + rightHeight + 1;
        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
    }
    static class Info{
        int diam;
        int ht;

        Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){// O(n)
        if(root == null){
            return  new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int diam = Math.max(leftInfo.ht+rightInfo.ht+1,Math.max(leftInfo.diam,rightInfo.diam));
        int ht = Math.max(rightInfo.ht,leftInfo.ht) + 1;
        return new Info(diam,ht);
    }
    public static void main(String[] args) {
        Node root = new Node (1);
        root.left = new Node (2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);

        System.out.println(diameter(root).ht);
        System.out.println(diameter(root).diam);



    }
}
