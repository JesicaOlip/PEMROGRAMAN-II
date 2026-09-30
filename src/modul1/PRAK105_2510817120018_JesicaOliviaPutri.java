package modul1;

import java.util.Scanner;

public class PRAK105_2510817120018_JesicaOliviaPutri {
    private static final double phi = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jari-jari : ");
        double radius = scanner.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double tinggi = scanner.nextDouble();

        double volume  = phi * radius * radius * tinggi;

        System.out.print("Volume tabung dengan jari-jari " + radius + " cm dan tinggi " + tinggi + " cm adalah " + String.format("%.3f", volume) + " m3");

        scanner.close();
    }
}

