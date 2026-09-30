package modul1;

import java.util.Scanner;

public class PRAK103_2510817120018_JesicaOliviaPutri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int angka = scanner.nextInt();

        int i = 0;
        do {
            if (angka % 2 == 0) {
                angka++;
            }
            System.out.print(angka);
            if (i != N - 1) System.out.print(",");
            angka++;
            i++;
        } while (i < N);
        System.out.println();
    }
}