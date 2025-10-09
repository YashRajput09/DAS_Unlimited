public class DeleteNode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

        public static void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    public static void deleteLastNode() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void deleteIdxNode(int idx){
        if(idx == 0){
            deleteFirstNode();
        }
        int i=0;
        Node temp = head;
        while (i < idx-1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    public static void traverseList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        for(int i=1; i<7; i++){
            insertAtLast(i);
        }
        traverseList();
        deleteFirstNode();
        traverseList();
        deleteLastNode();
        traverseList();
        deleteIdxNode(1);
        traverseList();
    }
}
