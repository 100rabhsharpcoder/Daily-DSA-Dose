package linkedList;

public class GFGDeleteAlternateNodes {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        
    }

    public static void deleteAlternate(ListNode head){
      ListNode curr =  head;

      while (curr!=null && curr.next != null) {
        curr.next = curr.next.next;
        curr = curr.next;
      }
    }
    
}
