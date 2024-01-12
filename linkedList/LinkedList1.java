package linkedList;

import Backtracking.permutationOfString2;

public class LinkedList1 {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        LinkedList1 linkedList = new LinkedList1(); // Create an instance of LinkedList1
        LinkedList1.ListNode l1 = linkedList.new ListNode(4);
        LinkedList1.ListNode l2 = linkedList.new ListNode(8);
        LinkedList1.ListNode l3 = linkedList.new ListNode(15);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        LinkedList1.ListNode ptr = l1;
        while (ptr != null) {
            System.out.println(ptr.val);
            ptr = ptr.next;
        }
    }

    public ListNode InsertAtBegening(ListNode head , int valToInsert){
        // create node to insert 
        ListNode newNode =  new ListNode(valToInsert);
       //Assign the next of this mode to head 
        newNode.next = head;
        // point the head of the list to this new node
        head =  newNode;

        return head;
    }
    public ListNode insertAtEnd(ListNode head , int valToInsert){
        ListNode newNode = new ListNode(valToInsert);
        ListNode ptr =  head;
        while (ptr.next !=null) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
        return head;
    }

     public ListNode insertAtMiddle(ListNode head ,int poition, int valToInsert){
        ListNode newNode = new ListNode(valToInsert);
        ListNode ptr =  head;
        for(int i=0; i< poition ; i++) {
            ptr = ptr.next;
        }
        newNode = ptr.next;
        ptr.next = newNode;

        return head;
    }
}

