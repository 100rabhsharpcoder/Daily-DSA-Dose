package linkedList.CircularLInkedList;

public class introCircularList {
    private class Node{
        int val;
        Node next;
        public Node(int val ){
            this.val = val;
        }
    }
    private Node head;
    private Node tail;
    public introCircularList(){
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        
    }

    public void inset (int val){
       Node node =  new Node(val);
       if (head == null) {
        head = node;
        tail = node;
        return;
       }
       tail.next = node;
       node.next = head;
       tail = node;
    }


    public void display(){
        Node node = head;
        if (head!=null) {
            do{
                System.out.println(node.val + " -> ");
                node  =  node.next;
            }while(node!=head);
        }
    }
    
}
