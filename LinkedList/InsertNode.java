public class InsertNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void insertAtPosotion(int idx, int data) {
        Node newNode = new Node(data);
        if (idx == 0) {
            insertAtFirst(data);
        }
        Node curr = head; 
        for (int i = 0; i < idx - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if(curr == null){
            System.out.println("Index out of bound");
        }
        newNode.next = curr.next;
        curr.next = newNode;
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
        for(int i=1; i<4; i++){
            insertAtLast(i);
        }
        tail = head.next.next;
        traverseList();
        insertAtFirst(0);
        traverseList();
        insertAtLast(4);
        traverseList();
        insertAtPosotion(3, 8);
        traverseList();
    }

}
