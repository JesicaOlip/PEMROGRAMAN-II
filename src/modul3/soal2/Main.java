package modul3.soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> namaBulan = new HashMap<>();
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");

        LinkedList<Negara> daftarNegara = new LinkedList<>();

        int jumlah = Integer.parseInt(input.nextLine());

        for (int i = 0; i < jumlah; i++) {
            String nama = input.nextLine();
            String jenis = input.nextLine();
            String pemimpin = input.nextLine();

            int tanggal = 0, bulan = 0, tahun = 0;
            if (!jenis.equalsIgnoreCase("monarki")) {
                tanggal = Integer.parseInt(input.nextLine());
                bulan = Integer.parseInt(input.nextLine());
                tahun = Integer.parseInt(input.nextLine());
            }

            daftarNegara.add(new Negara(nama, jenis, pemimpin, tanggal, bulan, tahun));
        }

        for (Negara n : daftarNegara) {
            String sebutan;
            if (n.getJenisKepemimpinan().equalsIgnoreCase("monarki")) {
                sebutan = "Raja";
            } else if (n.getJenisKepemimpinan().equalsIgnoreCase("presiden")) {
                sebutan = "Presiden";
            } else if (n.getJenisKepemimpinan().equalsIgnoreCase("perdana menteri")) {
                sebutan = "Perdana Menteri";
            } else {
                sebutan = n.getJenisKepemimpinan();
            }

            System.out.println("Negara " + n.getNama() + " mempunyai " + sebutan + " bernama " + n.getNamaPemimpin());

            if (!n.getJenisKepemimpinan().equalsIgnoreCase("monarki")) {
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + n.getTanggal() + " " + namaBulan.get(n.getBulan()) + " " + n.getTahun());
            }
        }

    }
}