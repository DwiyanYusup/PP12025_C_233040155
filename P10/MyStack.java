package P10;

public class MyStack extends AbstractStack {
    public MyStack(int capacity) {
        super(capacity);
    }

    public void displayStack(String s) {
        System.out.println(s);
        System.out.println("Stack (bottom-->):");
        for (int i = 0; i < getSize(); i++) {
            System.out.println(peekN(i));
        }
        System.out.println("");
    }

    public int peekN(int n) {
        return array[n];
    }
}
