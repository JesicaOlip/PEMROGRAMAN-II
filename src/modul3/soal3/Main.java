package modul3.soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Mahasiswa cariNim(ArrayList<Mahasiswa> daftar, String nim){
        for (Mahasiswa m : daftar) {
            if (m.getNim().equals(nim)) {
                return m;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftar = new ArrayList<>();

        int pilihan = -1;
        while (pilihan != 0) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = Integer.parseInt(input.nextLine());

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = input.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = input.nextLine();

                if (cariNim(daftar, nim) != null) {
                    System.out.println("NIM sudah terdaftar, gagal menambahkan.");
                } else {
                    daftar.add(new Mahasiswa(nama, nim));
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                }

            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nim = input.nextLine();
                Mahasiswa m = cariNim(daftar, nim);

                if (m != null) {
                    daftar.remove(m);
                    System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                } else {
                    System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                }

            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                String nim = input.nextLine();
                Mahasiswa m = cariNim(daftar, nim);

                if (m != null) {
                    System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
                } else {
                    System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                }

            } else if (pilihan == 4) {
                System.out.println("Daftar Mahasiswa:");
                for (Mahasiswa m : daftar) {
                    System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
                }

            } else if (pilihan == 0) {
                System.out.println("Terima kasih!");

            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}