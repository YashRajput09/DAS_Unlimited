
   class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    class BST{
        Node root;

        // ------- INSERT
        Node insert(Node root, int data){
            if(root == null){
                return new Node(data);
            }

            if(data <= root.data){
                root.left = insert(root.left, data);
            }else{
                root.right = insert(root.right, data)
            }
        }
        return root;
    }

public class BinarySearchTree {
    public static void main(String args[]){
        
    }
}
