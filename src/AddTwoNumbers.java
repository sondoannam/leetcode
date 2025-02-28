public class AddTwoNumbers {
    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;

            int sum = num1 + num2 + carry;
            int num = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(num);
            cur.next = newNode;
            cur = cur.next;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        ListNode result = head.next;
        head.next = null;
        return result;
    }
}
