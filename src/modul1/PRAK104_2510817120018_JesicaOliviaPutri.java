package modul1;

import java.util.Scanner;

public class PRAK104_2510817120018_JesicaOliviaPutri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] abu = new char[3];
        char[] bagas = new char[3];

        System.out.print("Tangan Abu: ");
        for (int j = 0; j < 3; j++) {
            abu[j] = scanner.next().charAt(0);
        }

        System.out.print("Tangan Bagas: ");
        for (int j = 0; j < 3; j++) {
            bagas[j] = scanner.next().charAt(0);
        }

        int skorAbu = 0;
        int skorBagas = 0;
        for (int j = 0; j < 3; j++) {
            char a = abu[j];
            char b = bagas[j];

            if ((a == 'B' && b == 'G') || (a == 'G' && b == 'K') || (a == 'K' && b == 'B')) {
                skorAbu++;
            } else if ((b == 'B' && a == 'G') || (b == 'G' && a == 'K') || (b == 'K' && a == 'B')) {
                skorBagas++;
            }
        }

        if (skorAbu > skorBagas) {
            System.out.println("Abu");
        } else if (skorBagas > skorAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
        scanner.close();
    }
}

