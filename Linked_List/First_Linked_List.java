package Linked_List;

class Node {
    int data;
    Node next;
}
public class First_Linked_List {
    public static void main(String[] args) {
        Node head = new Node();
        Node n1 = new Node();
        Node n2 = new Node();

        head.data = 1;
        n1.data = 2;
        n2.data = 3;

        head.next = n1;
        n1.next = n2;
        n2.next = null;


        for(Node temp = head; temp != null; temp = temp.next ) {
            System.out.print(temp.data + " ");
        }
    }
}
