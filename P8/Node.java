package P8;

public class Node {
    public Matakuliah data;
    public Node next;
    /** Inisialisasi atribut node */
    public Node(Matakuliah data) {
        this.data = data;
    }
    /** Setter & Getter */
    public void setData(Matakuliah data) {
        this.data = data;
    }

    public Matakuliah getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return next;
    }
}
