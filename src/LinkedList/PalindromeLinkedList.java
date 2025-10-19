package LinkedList;

public class PalindromeLinkedList {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null) {
            slow = slow.next;
        }

        ListNode newNode = reverse(slow);
        ListNode temp1 = head;
        ListNode temp2 = newNode;
        while (temp1 != null && temp2 != null) {
            if (temp1.val != temp2.val){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
    public static ListNode reverse (ListNode head) {
        ListNode before = null;
        ListNode temp = head;
        while(temp != null) {
            ListNode  after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
        return before;
    }
}
