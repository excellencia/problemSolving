package Collections.LinkedList;

public class MiddleOfALinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode hare, tortoise;
        hare = head;
        tortoise = head;

        while (hare != null && hare.next != null ){
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        return tortoise;

    }


}
