package P9;

public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        System.out.println("Tugas");
        System.out.println("### Sebelum Enqueue 4x ### ");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();

        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        System.out.println("### Enqueue 4x ### ");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println("front: " + queue.front());

        queue.dequeue();
        queue.dequeue();

        System.out.println("### Setelah Dequeue 2x ### ");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println("front: " + queue.front());
    }
}
