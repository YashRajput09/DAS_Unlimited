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
