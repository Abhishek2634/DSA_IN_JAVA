package BST;

public class PrintInRange {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            //left subtree;
            root.left = insert(root.left,val);
        }else{
            //right subtree;
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }
    public static void print(Node root,int k1,int k2){
        if(root == null){
            return ;
        }
        if(root.data >= k1 && root.data <= k2){
            print(root.left,k1,k2);
            System.out.print(root.data + " ");
            print(root.right,k1,k2);
        }else if (root.data < k1){
            print(root.right,k1,k2);
        }else{
            print(root.left, k1, k2);
        }

    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0; i < values.length;i++){
            root = insert(root,values[i]);
        }
        // inorder(root);    // inorder traversal on bst is always in ascending order.

        print(root, 11, 18);

    }
}
