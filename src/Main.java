import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        1. Two sums
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.solution(new int[]{2, 7, 11, 15}, 9)));

//        2. Add two numbers with linked list
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(8);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        l4.next = l5;
        l5.next = null;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.solution(l1, l4);
        while (result.next != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println(result.val);

//        3. Longest Substring Without Repeating Characters
        LongestSubstringWithoutRepeatingCharacter longestSubstring = new LongestSubstringWithoutRepeatingCharacter();
        System.out.println(longestSubstring.solution("abcabcbb"));
    }
}