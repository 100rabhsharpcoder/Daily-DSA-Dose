package linkedList;

import java.util.List;

/**
 * LeetCode160IntersectionofTwoLinkedLists
 */
public class LeetCode160IntersectionofTwoLinkedLists {

    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        
    }

    public ListNode getIntersectionNode(ListNode headA , ListNode headB){
        if (headA == null || headB == null) {
            return null;
        }
      int lengthA = getLength(headA);
      int lengthB = getLength(headB);
      ListNode ptrA = headA;
      ListNode ptrB = headB;

      while (lengthA> lengthB) {
        lengthA--;
        ptrA= ptrA.next;
      }

      while (lengthB>lengthA) {
        lengthB--;
        ptrB = ptrB.next;
      }

      while (ptrA != ptrB) {
        ptrA = ptrA.next;
        ptrB = ptrB.next;
      }

      return ptrA;

    }

    public static int getLength(ListNode head){
        int length =0;

        while (head!= null) {
            length++;
            head = head.next;
        }
        return length;
    }
}