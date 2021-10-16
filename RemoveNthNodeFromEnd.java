package Collections.LinkedList;
/*Given the head of a linked list, remove the nth node from the end of the list and return its head.
        https://leetcode.com/problems/remove-nth-node-from-end-of-list/*/
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode left = dummy, right = head;

        while(n > 0 && right.next != null){
            right = right.next;
            n--;
        }

        while(right != null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }

}
