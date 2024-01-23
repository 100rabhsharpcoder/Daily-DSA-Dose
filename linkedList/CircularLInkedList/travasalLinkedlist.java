package linkedList.CircularLInkedList;

public class travasalLinkedlist {
    private class Node{
        int val;
        Node next;
        public Node(int val ){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        
    }

    public void printList(Node head){
        Node ptr = head;
        if( head != null){
            do{
                System.out.println(ptr.val + " ");
            }while(ptr!=head);
        }
    }
}
