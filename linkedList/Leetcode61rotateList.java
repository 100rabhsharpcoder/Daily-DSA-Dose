package linkedList;

import org.w3c.dom.Node;

public class Leetcode61rotateList {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        

    }
    
    public ListNode rotateRight(ListNode head , int k){
        if (head == null || head.next ==  null || k == 0) {
            return head;
        }
    
        ListNode tail = head;
        int length = 1;
        while(tail.next!=null){
            tail = tail.next;
            length++;
        }
        k = k % length;
        if (k == 0 ) {
            return head;
        }
       ListNode newTail =  head;
       for(int i=0; i< length-k-1; i++){
        newTail = newTail.next;
       }

       ListNode newHead = newTail.next;
       newTail.next = null;
       tail.next=head;

       return newHead;

    }


    class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        if(k == 0){
            return null;
        }
        // add code here
        Node curr = head;
        int count = 1;
        
        while(count<k && curr!=null){
            curr = curr.next;
            count++;
        }
        if(curr == null){
            return null;
            
        }
        Node kth = curr;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = head;
        head = kth.next;
        kth.next = null;
        
        return head;
    }
}

}
