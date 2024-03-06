package BinaryTrees;

import java.util.ArrayList;

public class LowestCommonAncestor {
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

    public static boolean getPath(Node root,int n, ArrayList<Node>path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if(foundLeft || foundRight){
            return true;
        }
        
        path.remove(path.size() - 1);
        return false;
    }
    public static Node lca(Node root,int n1 , int n2){
        ArrayList <Node> Path1 = new ArrayList<>();
        ArrayList<Node> Path2 = new ArrayList<>();

        getPath(root,n1,Path1);
        getPath(root,n2,Path2);

        int i = 0;
        for( ; i < Path1.size() && i < Path2.size();i++){
            if(Path1.get(i) != Path2.get(i)){
                break;
            }
        }
        Node lca = Path1.get(i-1);
        return lca;
    }
    public static Node optimised(Node root,int n1,int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
       Node leftLca = optimised(root.left, n1, n2);
        Node rightLca = optimised(root.right, n1, n2);
        if(rightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node (1);
        root.left = new Node (2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);

        int n1 = 4;
        int n2 = 6;
        // System.out.println(lca(root,n1,n2).data);
        System.out.println(optimised(root,n1,n2).data);
    }
}
