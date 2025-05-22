package P6;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
    
        list.addTail(6);
        list.addTail(1);
        list.addMid(5,2);
        list.addMid(3,2);
        list.addHead(2);

        System.out.print("Sebelum dihapus: ");
        list.displayElement();
        System.out.println();

        // Menghapus elemen tengah (misalnya: 3)
        list.removeMid(3);

        System.out.print("Setelah dihapus: ");
        list.displayElement();
    }
}
