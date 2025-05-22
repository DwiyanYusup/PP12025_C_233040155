package P5;

public class StrukturList {
    Node HEAD;
    
    public void addTail(double data) { // nilai data bisa di ubah menjadi Integer
        Node posNode = null, curNode=null;
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else  {
            curNode = HEAD;
            while (curNode !=null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }
    public void addHead(double data) { // nilai data bisa di ubah menjadi Integer 
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMid(double data, int pos) { // nilai data bisa di ubah menjadi Integer
        Node newNode = new Node(data);
        if (HEAD == null || pos == 1) {
            newNode.Next = HEAD;
            HEAD = newNode;
            return;
        }

        Node curNode = HEAD;
        Node posNode = null;
        int i = 1;

        while (curNode != null && i < pos) {    
            posNode = curNode;
            curNode = curNode.getNext();
            i++;
        }
        posNode.setNext(newNode);
        newNode.setNext(curNode);
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    private void dispose(Node Node) {
        Node.setNext(null);
        Node = null;
    }

    public void removeHead() {
        if(isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node tempNode = HEAD;
            HEAD = HEAD.getNext();
            dispose(tempNode);
        }
    }

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode !=null) {
            System.out.print(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }
}
