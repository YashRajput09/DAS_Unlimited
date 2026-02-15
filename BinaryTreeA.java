

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeA {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // root -> left -> right
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " -> ");
        preorder(root.left);
        preorder(root.right);
    }

    // left -> right -> root
    static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " -> ");

    }

    // left -> root -> right
    static void inorder(Node root){
       if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " -> ");
        inorder(root.right);
    }

    // height of a tree
    static int height(Node root){
       if (root == null) return 0;
       return 1 + Math.max(height(root.left), height(root.right));

    }

    // Level order traversal
    public static void levelorder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            } else{
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

    // Count Tree Nodes
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = countNode(root.left);
        int rightCount = countNode(root.right);
        return leftCount + rightCount + 1; 
    }

    // Diameter of Tree O(n^2)
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    // Diameter of a Tree O(n)
    public static int optimizedDiameter(Node root){
        if(root == null){
            return 0;
        }

    }

    // check Subtree of a Tree

    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null){
            return true;
        } else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null) return false;

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    // Main function
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

                //      1
                //     / \
                //    2   3
                //   / \   \
                //  4   5   6

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

                //    2  
                //   / \ 
                //  4   5 

        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        int h = height(root);   
        System.out.println("Height: "+ h);
        levelorder(root);
        System.out.println("Total Nodes : "+countNode(root)) ;
        System.out.println("Diameter of tree: "+ diameter(root));
        System.out.println("Subtree of tree: "+ isSubtree(root, subRoot));
        
        
    }
}
