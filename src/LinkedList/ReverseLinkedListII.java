package LinkedList;

public class ReverseLinkedListII {
    public static void main(String[] args) {

    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode before = newNode;
        for(int i=0;  i < left - 1; i++) {
            before = before.next;
        }
        ListNode current = before.next;
        for(int i = 0; i < right - left; i++) {
            ListNode after = current.next;
            current.next = after.next;
            after.next = before.next;
            before.next = after;


        }
        return newNode.next;
    }
}
