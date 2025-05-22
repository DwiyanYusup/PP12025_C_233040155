package P8;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StrukturList list = new StrukturList();
        int pilih;

        do {
            System.out.println("\n=== MENU LINKED LIST ===");
            System.out.println("1. Tambah Awal");
            System.out.println("2. Tambah Tengah");
            System.out.println("3. Tambah Akhir");
            System.out.println("4. Tampilkan");
            System.out.println("5. Hapus Awal");
            System.out.println("6. Hapus Tengah");
            System.out.println("7. Hapus Akhir");
            System.out.println("8. Cari Data");
            System.out.println("9. Jumlah Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    list.addHead(inputMatkul(sc));
                    break;
                case 2:
                    System.out.print("Posisi: ");
                    int pos2 = sc.nextInt(); sc.nextLine();
                    list.addMid(inputMatkul(sc), pos2);
                    break;
                case 3:
                    list.addTail(inputMatkul(sc));
                    break;
                case 4:
                    list.displayElement();
                    break;
                case 5:
                    list.removeHead();
                    break;
                case 6:
                    System.out.print("Posisi: ");
                    int pos6 = sc.nextInt(); sc.nextLine();
                    list.removeMid(pos6);
                    break;
                case 7:
                    list.removeTail();
                    break;
                case 8:
                    System.out.print("Kode matakuliah: ");
                    String kode = sc.nextLine();
                    list.find(kode);
                    break;
                case 9:
                    System.out.println("Jumlah data: " + list.count());
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }            
        } while (pilih != 0);
    }

    // Fungsi bantu untuk input matakuliah
    public static Matakuliah inputMatkul(Scanner sc) {
        System.out.print("Kode: ");
        String kode = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("SKS: ");
        int sks = sc.nextInt(); sc.nextLine();
        return new Matakuliah(kode, nama, sks);
    }
}

