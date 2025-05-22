package P10;

public class StrukturStack {

    private int[] array;
    private int capacity;
    private int TOP;

    public final int MIN = -1;

    public boolean isEmpty() {
        return TOP == MIN;
    }

    public boolean isFull() {
        return TOP == capacity - 1;
    }

    public int getSize() {
        return TOP + 1;
    }

    public int getTop() {
        if (isEmpty()) {
            return -1;
        }
        return array[TOP];
    }

    public StrukturStack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        TOP = MIN;
    }
    
    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    public void printStack() {
            System.out.print("Elemen From TOP: ");
            for (int i = TOP; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            int removed = array[TOP];
            TOP--;
            return removed;
        }
    }   
}