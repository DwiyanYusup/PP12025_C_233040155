package P6;

public class Node {
    private int data;
    private Node next;
    public Node Next;
    /** Inisialisasi atribut node */
    public Node(int data2) {
        this.data = data2;
    }

    /** Setter & Getter */
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return next;
    }
}
