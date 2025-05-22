package P10;

public abstract class AbstractStack {
    protected int[] array;
    protected int capacity;
    protected int TOP;
    public final int MIN = -1;

    public AbstractStack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        TOP = MIN;
    }

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
        if (isEmpty()) return -1;
        return array[TOP];
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            array[++TOP] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            return array[TOP--];
        }
    }

    public void printStack() {
        System.out.print("Elemen From TOP: ");
        for (int i = TOP; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Contoh method abstract (optional)
    public abstract void displayStack(String s);
}

