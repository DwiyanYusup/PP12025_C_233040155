package P5;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
    
        list.addHead(2);
        list.addHead(9);
        list.addHead(7);

        System.out.print("Element List Awal: ");
        list.displayElement();
    }
}
