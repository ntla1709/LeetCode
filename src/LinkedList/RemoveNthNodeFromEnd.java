package LinkedList;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode temp = head;
        for(int i = 0; i < n; i++) {
            temp = temp.next;
        }
        ListNode before = newNode;
        ListNode current = head;
        while (temp != null) {
            current = current.next;
            before = before.next;
            temp = temp.next;
        }

        before.next = current.next;
        current.next = null;
        return newNode.next;
    }
}
