package linkedList;

import java.util.Stack;

public class ReverseTheLInkedList {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the class to use non-static methods
        ReverseTheLInkedList reverseLinkedList = new ReverseTheLInkedList();

        // Example usage:
        ListNode l1 = reverseLinkedList.new ListNode(4);
        ListNode l2 = reverseLinkedList.new ListNode(8);
        ListNode l3 = reverseLinkedList.new ListNode(15);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        // Reverse the linked list
        reverseLinkedList.reverseList(l1);
    }

    public void reverseList(ListNode head) {
        Stack<Integer> valStack = new Stack<>();
        while (head != null) {
            valStack.push(head.val);
            head = head.next;
        }
        while (!valStack.isEmpty()) {
            System.out.println(valStack.pop());
        }
    }
}
