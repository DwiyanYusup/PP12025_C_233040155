package P5;

public class Node {
    private double data;
    private Node next;
    public Node Next;
    /** Inisialisasi atribut node */
    public Node(double data2) {
        this.data = data2;
    }

    /** Setter & Getter */
    public void setData(int data) {
        this.data = data;
    }
    public double getData() {
        return data;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return next;
    }
}
