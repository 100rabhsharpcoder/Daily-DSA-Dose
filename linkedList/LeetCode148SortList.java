package linkedList;

import java.util.List;

/**
 * LeetCode148SortList
 */
public class LeetCode148SortList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        
    }
     

    public ListNode sortList( ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode middle = middle(head);
        ListNode secondHalf  = middle.next;
        middle.next =  null;
        return mergeSort(middle, secondHalf);


    }

    
    private ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode mergeSort(ListNode l1 , ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (l1!=null && l2!=null) {
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1 == null){
            curr.next = l2;
        }else{
            curr.next = l1;
        }
        return dummy.next;
    }
}
  
 