public class runLinkedList {
    public static void main( String[] args){

        linkedList list = new linkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);

        list.reverseLinkedList();
        list.printLinkedList();
        list.reverseLinkedList();
        list.printLinkedList();
    }
}
