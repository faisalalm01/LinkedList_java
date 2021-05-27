
package linked_list;

public class SinglyLinkedListApp {
    
    public static void main(String[] args) {
        
        SinglyLinkedList k = new SinglyLinkedList();
        k.insertAwal(100);
        k.display();
        k.insertAkhir(200);
        k.display();
        k.insertAtPos(50 ,1);
        k.display();
        k.insertAtPos(80, 2);
        k.display();
        k.deleteAtPos(1);
        k.display();
    }
}
