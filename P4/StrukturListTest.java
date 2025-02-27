package P4;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
    
        list.addTail(2.1);
        list.addTail(5.5);
        list.addMid(4.5,2);
        list.addMid(1.1,2);
        list.addHead(3.4);

        list.displayElement();
    }
}
