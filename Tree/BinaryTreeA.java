package Tree;
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

    static int height(Node root){
       if (root == null) return -1;
       return 1 + Math.max(height(root.left), height(root.right));

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        int h = height(root);
        System.out.println("Height: "+ h);
    }
}
