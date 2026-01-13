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

        public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    public void deleteLastNode() {
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

    public void deleteIdxNode(int idx){
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

        public void traverseList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNthFromEnd(int n){
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++; 
        }
        int i=1;
        Node prev = head;
        while (i < size-n) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        DeleteNode dn = new DeleteNode();
        for(int i=1; i<7; i++){
            dn.insertAtLast(i);
        }
        dn.traverseList();
        dn.deleteNthFromEnd(3);
        dn.traverseList();
    }
}
