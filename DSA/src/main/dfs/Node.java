package main.dfs;

public class Node {
    int key;
    Node left, right;

    public Node(int item){
        left = right = null;
    }
}

class BinaryTree{
    Node root;

    BinaryTree(){
        root = null;
    }

    void printInorder(Node node){
        if(node == null)
            return;

        printInorder(node.left);
        System.out.println(node.key + " ");
        printInorder(node.right);
    }
    void printInorder(){
        printInorder(root);
    }
}
