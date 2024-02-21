package linkedList;

public class LeetCode1721SwappingNodesLinkedList {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
 public static void main(String[] args) {
    
 }
 public ListNode swapNodes(ListNode head, int k){
    ListNode dummy  =  new ListNode(0);
    dummy.next = head;
    ListNode temp = head;
    int length = 0;
    while (temp!=null) {
        length++;
        temp = temp.next;
    }
    ListNode firstNode = dummy;
    for(int i=0; i<k; i++){
        firstNode = firstNode.next;
    }
    ListNode secondNode = dummy;
      for(int i=0; i<length-k+1; i++){
        secondNode = secondNode.next;
    }

    int t = firstNode.val;
    firstNode.val = secondNode.val;
    secondNode.val = t;
    return head;
 }

}
