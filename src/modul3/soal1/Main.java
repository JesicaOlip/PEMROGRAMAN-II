package modul3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = input.nextInt();

        LinkedList<Dadu> daftarDadu = new LinkedList<>();
        int total = 0;

        for (int i = 0; i < jumlah; i++){
            Dadu d = new Dadu();
            daftarDadu.add(d);

            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + d.getNilai());
            total += d.getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}