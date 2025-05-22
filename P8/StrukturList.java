package P8;

public class StrukturList {
    Node HEAD;

    public StrukturList() {
        HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(Matakuliah data) { // nilai data bisa di ubah menjadi Integer
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addTail(Matakuliah data) { // nilai data bisa di ubah menjadi Integer
        Node posNode = null, curNode = null;
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void addMid(Matakuliah data, int pos) { // nilai data bisa di ubah menjadi Integer
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
        if (HEAD == null) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println
                ("Matakuliah: "+curNode.getData().getKode() + ", "
                +curNode.getData().getNama()+", "
                +curNode.getData().getSks());
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }

    public int count() {
        int count = 0;
        Node curNode = HEAD;
        while (curNode != null) {
            count++;
            curNode = curNode.getNext();
        }
        return count;
    }

    public void removeHead() {
        if (HEAD != null) {
            HEAD = HEAD.getNext();
        } else {
            System.out.println("List kosong");
        }
    }
    public void removeTail() {
        if (HEAD == null) {
            System.out.println("List Kosong");
        } else if (HEAD.getNext() == null) {
            HEAD = null;
        } else {
            Node curNode = HEAD;
            Node posNode = null;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(null);
        }
    }
    public void removeMid(int pos) {
        if (HEAD == null) {
            System.out.println("List Kosong");
        } else if (pos == 1) {
            HEAD = HEAD.getNext();
        } else {
            Node curNode = HEAD;
            Node posNode = null;
            int i = 1;
            while (curNode != null && i < pos) {
                posNode = curNode;
                curNode = curNode.getNext();
                i++;
            }
            if (curNode != null) {
                posNode.setNext(curNode.getNext());
            } else {
                System.out.println("Posisi tidak ditemukan");
            }
        }
    }    
    public void find(String kode) {
        Node cur = HEAD;
        boolean found = false;
        while (cur != null) {
            if (cur.getData().getKode().equalsIgnoreCase(kode)) {
                System.out.println("Ditemukan: " + cur.getData().getNama() + " (" + cur.getData().getSks() + " SKS)");
                found = true;
                break;
            }
            cur = cur.getNext();
        }
        if (!found) {
            System.out.println("Matakuliah dengan kode " + kode + " tidak ditemukan.");
        }
    }
}
