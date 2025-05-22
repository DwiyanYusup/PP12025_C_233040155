package P6;

public class StrukturList {
    Node HEAD;
    
    public void addTail(int data) { // nilai data bisa di ubah menjadi Integer
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
    public void addHead(int data) { // nilai data bisa di ubah menjadi Integer 
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMid(int data, int pos) { // nilai data bisa di ubah menjadi Integer
        Node newNode = new Node(data);
        if (HEAD == null || pos == 1) {
            newNode.setNext(HEAD);
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

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode !=null) {
            System.out.print(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }

    public void removeMid(int e) {
        Node preNode = null;
        Node tempNode;
        int i;
        boolean ketemu;

        if(HEAD == null) {
            System.out.println("Elemen List Kosong");
        }
        else 
        {
            ketemu = false;
            i = 1;
            tempNode = HEAD;
            while (tempNode != null && !ketemu) {
                if (tempNode.getData() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }
            if (ketemu == true) {
                if(tempNode == HEAD) {
                    HEAD = HEAD.getNext();
                } else {
                    preNode.setNext(tempNode.getNext());
            }
        }

    }
}
}