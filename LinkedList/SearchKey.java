public class SearchKey {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    public void traverseList() {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public void InsertNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void Search(int key) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Key found at index: " + i);
                return;
            }
            temp = temp.next;
            i++;
        }
        System.out.println("key not found");
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int RecursiveSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        SearchKey sk = new SearchKey();
        sk.InsertNode(1);
        sk.InsertNode(2);
        sk.InsertNode(3);
        sk.InsertNode(4);
        sk.InsertNode(5);
        sk.Search(3);
        System.out.println("Key found at index: " + sk.RecursiveSearch(1));
        sk.traverseList();
    }
}
