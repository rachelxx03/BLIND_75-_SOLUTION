public class linkedList {
    Node head;

    public void reverseLinkedList(){
        Node previous = null;
        Node current = head;
        while (current != null){
            Node next = current.next;
            current.next = previous;
            previous=current;
            current = next;
        }
        head = previous;
    }

    public void  deleteANodeAtPositon(int data){
        Node current = head;
        Node previous = null;
        while (current.next != null){

            if(current.data ==data){
                if(previous == null){
                    head =current.next;
                }
                else {
                    previous.next = current.next;
                }
                break;
            }
            previous = current;
            current = current.next;

        }

    }



    public void  deleteANode(int data){
        Node current = head;
        Node previous = null;
        while (current.next != null){

            if(current.data ==data){
                if(previous == null){
                    head =current.next;
                }
                else {
                    previous.next = current.next;
                }
                break;
            }
            previous = current;
            current = current.next;

        }

    }
    public void insert(int data){
        Node node = new Node();
        node.data=data;
        if (head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next =node;
        }

    }
    public void insertfromstart(int data){
        Node node = new Node();
        node.data= data;
        if(head == null){
            head =node;
        }
        else {
        node.next =head;
        head = node;

        }
    }

    public void  printLinkedList(){
        Node n = head;
        while (n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}

class Node{
    int data;
    Node next;
}
