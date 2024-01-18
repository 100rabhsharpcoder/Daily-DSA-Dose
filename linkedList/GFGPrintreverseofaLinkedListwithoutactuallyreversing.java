package linkedList;

public class GFGPrintreverseofaLinkedListwithoutactuallyreversing {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
 public static void main(String[] args) {
    
 }  
 
 public void printReverseWRI(ListNode head){
    if(head == null){
        return;
    }
    printReverseWRI(head.next);
    System.out.println(head.val);
 }
}
