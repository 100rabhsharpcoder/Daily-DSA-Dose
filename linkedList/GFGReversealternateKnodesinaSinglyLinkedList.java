package linkedList;

import java.rmi.registry.LocateRegistry;
import java.util.List;

public class GFGReversealternateKnodesinaSinglyLinkedList {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
    
    public static void main(String[] args) {
        
    }

    public static ListNode kAltreverse(ListNode head, int k){
        ListNode current  = head ;
        ListNode prev = null, nextNode =  null;
        int count = 0;
        while (current!=null && count < k) {
            nextNode =  current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        if (head != null) {
            head.next =  current;
        }
          count =0;
        while ( count< k-1 && current != null ) {
            current = current.next;
            count++;
        }
        if (current!=nextNode) {
            current.next = kAltreverse(head.next, k);
        }

        return prev;
    }
}
