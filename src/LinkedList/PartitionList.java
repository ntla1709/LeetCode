package LinkedList;

public class PartitionList {
/**
        * Definition for singly-linked list.
        * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public static void main(String[] args) {

    }
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(0);
        ListNode d2 = new ListNode(0);

        ListNode dum1 = d1;
        ListNode dum2 = d2;

        ListNode temp = head;
        while (temp != null) {
            if (temp.val < x) {
                dum1.next = temp;
                dum1 = dum1.next;
            } else {
                dum2.next = temp;
                dum2 = dum2.next;
            }
            temp = temp.next;
        }
        dum1.next = d2.next;
        dum2.next = null;
        head = d1.next;
        return head;
    }
}
