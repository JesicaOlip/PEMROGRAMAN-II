package modul1;

import java.util.Scanner;

public class PRAK102_2510817120018_JesicaOliviaPutri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int awal = scanner.nextInt();

        int i = 0;
        while (i < 10) {
            int x = awal + i;
            if (x % 5 == 0) x = (x / 5) - 1;
            System.out.print(x);
            if (i != 9) System.out.print(", ");
            i++;
        }
        System.out.println();
    }
}