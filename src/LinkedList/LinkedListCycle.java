package LinkedList;

public class LinkedListCycle {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }


        }
        return false;
    }
}
