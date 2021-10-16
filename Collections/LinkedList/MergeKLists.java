package Collections.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        int end = lists.length - 1;

        // repeat until only one list is left
        while(end != 0){
            int i = 0, j = end;
            while(i < j){

                // merge List i with List j and store
                // merged list in List i
                lists[i] = SortedMerge(lists[i],lists[j]);

                i++;
                j--;

                // If all pairs are merged, update last
                if (i >= j)
                    end = j;
            }
        }

        return lists[0];
    }

    /* Takes two lists sorted in increasing order, and merge
    their nodes together to make one big sorted list. Below
    function takes O(Log n) extra space for recursive calls,
    but it can be easily modified to work with same time and
    O(1) extra space  */
    public static ListNode SortedMerge(ListNode a, ListNode b)
    {
        ListNode result = null;
        /* Base cases */
        if (a == null)
            return b;
        else if (b == null)
            return a;

        /* Pick either a or b, and recur */
        if (a.val <= b.val) {
            result = a;
            result.next = SortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = SortedMerge(a, b.next);
        }

        return result;
    }

    /* Function to print nodes in a given linked list */
    public static void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        MergeKLists mergeKLists = new MergeKLists();
        ListNode l1 = new ListNode();
        l1.next = new ListNode();
        l1.next.next = new ListNode();
        ListNode l2 = new ListNode();
        l2.next = new ListNode();
        l2.next.next = new ListNode();
        ListNode l3 = new ListNode();
        l3.next = new ListNode();
        l1.val = 1;
        l1.next.val = 4;
        l1.next.next.val = 5;
        l2.val = 1;
        l2.next.val = 3;
        l2.next.next.val = 4;
       // l2.next.next.next.val = 4;
        l3.val = 2;
        l3.next.val = 6;

        ListNode[] lists = new ListNode[]{l1,l2,l3};
        l1 = mergeKLists.mergeKLists(lists);
        printList(l1);
    }
}
