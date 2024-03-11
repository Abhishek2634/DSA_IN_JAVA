package BinaryTrees;

import java.util.ArrayList;

public class MergeTwoBst {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void getInorder(Node root,ArrayList<Integer>ls){
        if(root == null){
            return;
        }
        getInorder(root.left,ls);
        ls.add(root.data);
        getInorder(root.right,ls);
    }
    public static Node mergeBst(Node root1,Node root2){
        //step 1
        ArrayList<Integer>ls1 = new ArrayList<>();
        getInorder(root1, ls1);
        //step 2
        ArrayList<Integer>ls2 = new ArrayList<>();
        getInorder(root2, ls2);

        //merge
        int i = 0, j = 0;
        ArrayList <Integer>finalList = new ArrayList<>();
        while(i < ls1.size() && j < ls2.size()){
            if(ls1.get(i) <= ls2.get(j)){
                finalList.add(ls1.get(i));
                i++;
            }else{
                finalList.add(ls2.get(j));
                j++;
            }
        }
        while(i < ls1.size()){
            finalList.add(ls1.get(i));
             i++;
        }
        while(j < ls2.size()){
            finalList.add(ls2.get(j));
            j++;
        }

        // sorted list --> balanced bst karo.
        return createBalancedBst(finalList,0,finalList.size() - 1);
}
    public static Node createBalancedBst(ArrayList<Integer>ans ,int st,int end){
        if(st > end){
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node (ans.get(mid));
        root.left = createBalancedBst(ans, st, mid - 1);
        root.right = createBalancedBst(ans,mid + 1, end);
        return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

       Node root =  mergeBst(root1, root2);
        preOrder(root);
    }
    
}
