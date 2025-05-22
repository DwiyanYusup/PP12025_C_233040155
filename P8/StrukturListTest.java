package P8;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addTail(new Matakuliah("IF001", "Dasar Pemograman", 4));
        list.addMid(new Matakuliah("IF002", "Pemograman Web", 3),1);
        list.addMid(new Matakuliah("IF003", "Struktur Diskrit", 3),1);
        list.addMid(new Matakuliah("IF005", "Pemgoraman Dasar", 3),1);
        list.addMid(new Matakuliah("IF006", "Infrastruktur Jaringan", 3),1);
        list.addHead(new Matakuliah("IF004", "Kontruksi PL Berorientasi Objek", 3));
        list.displayElement();
        System.out.println("Jumlah Matakuliah: " + list.count());
    }
}
