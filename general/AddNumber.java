package general;

public class AddNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Result result = new Result();
        int carry = 0;
        while(l1 != null || l2 != null){
            int n1 = (l1 == null) ? 0 : l1.val;
            int n2 = (l2 == null) ? 0 : l2.val;
            int sum = n1 + n2 + carry;
            result.append(sum % 10);
            carry = (sum > 9) ? 1 : 0;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if (carry > 0) result.append(1);

        return result.head.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode();
        ListNode l1 = new ListNode(2, new ListNode());
        l1 = new ListNode(4,new ListNode());
        l1 = new ListNode(3, new ListNode());
        ListNode l2 = new ListNode(5, new ListNode());
        l2.next.val = 6;
        l2.next.val = 4;
        AddNumber addNumber = new AddNumber();
        addNumber.addTwoNumbers(l1,l2);
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Result{
    public ListNode head ;
    public ListNode tail ;

    public Result(){
        this.head = new ListNode();
        this.tail = head;
    }
    public void append(int val){
        ListNode node = new ListNode(val);
        this.tail.next = node;
        this.tail = node;
    }
}