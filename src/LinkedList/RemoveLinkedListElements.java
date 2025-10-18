package LinkedList;

public class RemoveLinkedListElements {
    public static void main(String[] args) {

    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode before = newNode;
        ListNode temp = head;
        while (temp != null) {
            if(temp.val == val) {
                before.next = temp.next;
                temp.next = null;
                temp = before.next;
            } else {
                before = temp;
                temp = temp.next;
            }
        }
        return newNode.next;
    }
}
