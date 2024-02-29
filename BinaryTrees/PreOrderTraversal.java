package BinaryTrees;
import java.util.*;

public class PreOrderTraversal {//O(N)
    static class Node {
        int data;
        Node left;
        Node right;
            Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public void preOrder(Node root){
            if(root == null){
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public void inOrder(Node root){
            if(root == null){
                System.out.print(-1+" ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public void postOrder(Node root){
            if(root == null){
                System.out.print(-1+" ");
                return ;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public void levelOrder(Node root){
            Queue<Node>q = new LinkedList<>();
            if(root == null){
                return;
            }
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        return;
                    }
                    q.add(null);
                }else{
                    System.out.print(currNode.data+ " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // tree.preOrder(root);
        // tree.inOrder(root);
        // tree.postOrder(root);
        tree.levelOrder(root);
    }
}
