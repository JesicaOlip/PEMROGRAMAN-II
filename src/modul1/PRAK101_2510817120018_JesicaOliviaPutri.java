package modul1;

import java.util.Scanner;

public class PRAK101_2510817120018_JesicaOliviaPutri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.print("Masukkan Nama Lengkap : ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Tempat Lahir : ");
        String placeOfBirth = scanner.nextLine();

        int day, month, year;
        boolean valid = true;

        do {
            System.out.print("Masukkan Tanggal Lahir : ");
            day = scanner.nextInt();
            System.out.print("Masukkan Bulan Lahir : ");
            month = scanner.nextInt();
            System.out.print("Masukkan Tahun Lahir : ");
            year = scanner.nextInt();

            int maxHari;
            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    maxHari = 29;
                } else {
                    maxHari = 28;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxHari = 30;
            } else {
                maxHari = 31;
            }

            if (month < 1 || month > 12 || day < 1 || day > maxHari) {
                System.out.println("Tanggal tidak valid, isi ulang.");
                valid = false;
            } else {
                valid = true;
            }
        } while (!valid);

        System.out.print("Masukkan Tinggi Badan : ");
        int height = scanner.nextInt();
        System.out.print("Masukkan Berat Badan : ");
        double weight = scanner.nextDouble();

        System.out.println("Nama Lengkap " + name + ", Lahir di " + placeOfBirth + " pada Tanggal " + day + " " + namaBulan[month - 1] + " " + year);
        System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");
    }
}