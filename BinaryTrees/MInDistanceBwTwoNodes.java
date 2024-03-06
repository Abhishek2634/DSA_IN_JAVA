package BinaryTrees;

public class MInDistanceBwTwoNodes {
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
    public static Node Lca(Node root,int n1,int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
       Node leftLca = Lca(root.left, n1, n2);
        Node rightLca = Lca(root.right, n1, n2);
        if(rightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }
        return root;
    }
    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }else if (leftDist == -1){
            return rightDist + 1;
        }else{
            return leftDist + 1;
        }
    }
    public static int minDist(Node root, int n1,int n2){
        Node lca = Lca(root,n1,n2);
        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);
        return dist1 + dist2;
    }
    public static void main(String[] args) {
        //min distance b/w two nodes is the distances from the lowest common ancestor of both the nodes.
        Node root = new Node (1);
        root.left = new Node (2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);

        int n1 = 4;
        int n2 = 6;
        System.out.println(minDist(root,n1,n2));;
    }
}
