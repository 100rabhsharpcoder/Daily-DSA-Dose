package linkedList;

import java.util.List;

public class insertionInLinkedList {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        
    }
    public ListNode insertInStart(ListNode head, int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        return newNode;
    }

    public ListNode atEndofList(ListNode head, int data){
        ListNode curr = head;
        while (head!=null) {
            curr = curr.next;
            
        }
        ListNode newNode = new ListNode(data);
        curr.next = newNode;
        return head;
    }
}
