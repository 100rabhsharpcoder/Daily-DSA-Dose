package linkedList;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class GFGFindUnion {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

 public static void main(String[] args) {
    
 }  
 
 public ListNode findUnion(ListNode head1 , ListNode head2){
    Set<Integer> set =  new HashSet<>();

    while (head1!=null) {
        set.add(head1.val);
        head1 = head1.next;        
    }

    while (head2 != null) {
        set.add(head2.val);
        head2 = head2.next;
    }

    PriorityQueue<Integer> pq  = new PriorityQueue<>(set);

    ListNode resultHead = null;
    ListNode resultTail = null;

    while (!pq.isEmpty()) {
        ListNode newNode = new ListNode(pq.poll());
        if(resultHead == null){
            resultHead = newNode;
            resultTail = resultHead;
        }else{
            resultTail.next = newNode;
            resultTail = newNode;
        }
    }
    return resultHead;
 }
}
