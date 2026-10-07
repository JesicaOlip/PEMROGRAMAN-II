package modul2.PRAK202_2510817120018_JesicaOliviaPutri;

public class Kopi {
    public String namaKopi;
    public String ukuran;
    public double harga;
    private String pembeli;

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return this.pembeli;
    }

    public double getPajak() {
        return harga * 11 / 100;
    }

    public void info() {
        System.out.printf("Nama Kopi: %s\n" +
                        "Ukuran: %s\n" +
                        "Harga: Rp. %.1f\n",
                        this.namaKopi, this.ukuran, this.harga);
    }
}
