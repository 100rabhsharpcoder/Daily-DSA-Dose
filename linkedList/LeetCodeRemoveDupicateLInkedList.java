package linkedList;

public class LeetCodeRemoveDupicateLInkedList {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
 public static void main(String[] args) {
    
 }  
 public ListNode removerDuplicate(ListNode head){
    ListNode currrent =  head;
     while (currrent!=null && currrent.next !=null) {
        if (currrent.val == currrent.next.val) {
            currrent = currrent.next.next;
        }else{
            currrent = currrent.next;
        }
     }
     return head;
 }
}
