public class PalindromCheck {
    public static class Node{
        int data; 
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = tail.next;
    }

    public void traverseList(){
        if(head == null){
            System.out.println("Linked list is empty");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    private Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head == null && head.next == null){
            return true;
        }

        // find mid node
        Node mid = findMidNode(head);

        // reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // compare nodes
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        PalindromCheck pc = new PalindromCheck();
        pc.addLast(0);
        pc.addLast(1);
        // pc.addLast(1);
        pc.addLast(0);
        pc.traverseList();
        System.out.println(pc.checkPalindrome());
    }
}
