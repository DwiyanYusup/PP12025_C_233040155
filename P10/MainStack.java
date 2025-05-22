package P10;

public class MainStack {
    public static void main(String[] args) {
    StrukturStack stack = new StrukturStack(3);

    System.out.println("#Sebelum Push");
    System.out.println("Size: " + stack.getSize());
    System.out.println("Empty: " + stack.isEmpty());
    System.out.println("Full: " + stack.isFull());
    System.out.println("Top: " + stack.getTop());
    stack.printStack();

    System.out.println("#melakukan push 3X");
    System.out.println("Push 2, push 4, push 1");
    stack.push(2);
    stack.push(4);
    stack.push(1);
    
    System.out.println("Size: " + stack.getSize());
    System.out.println("Empty: " + stack.isEmpty());
    System.out.println("Full: " + stack.isFull());
    System.out.println("Top: " + stack.getTop());
    stack.printStack();
    
    System.out.println("#melakukan pop 2X");
    System.out.println("Pop: " + stack.pop());
    System.out.println("Pop: " + stack.pop());

    System.out.println("Size: " + stack.getSize());
    System.out.println("Empty: " + stack.isEmpty());
    System.out.println("Full: " + stack.isFull());
    System.out.println("Top: " + stack.getTop());
    stack.printStack();


    }
}
