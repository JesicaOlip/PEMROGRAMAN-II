package modul2.PRAK201_2510817120018_JesicaOliviaPutri;

public class Buah {
    private String nama;
    private double berat;
    private double harga;
    private double jumlah_beli;
    private double total;
    private double diskon;

    Buah(String nama, double berat, double harga, double jumlah_beli){
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlah_beli = jumlah_beli;
    }

    public double getHargaPerKg(){
        return harga / berat;
    }

    public double getTotal(){
        return jumlah_beli * getHargaPerKg();
    }

    public double getDiskon(){
        int beratDiskon = (int) (jumlah_beli / 4) * 4;
        return beratDiskon * getHargaPerKg() * 0.02;
    }

    public void info() {
        this.total = getTotal();
        this.diskon = getDiskon();

        System.out.printf("" +
                        "Nama Buah: %s\n" +
                        "Berat: %.2f\n" +
                        "Harga: %.2f\n" +
                        "Jumlah Beli: %.2f kg\n" +
                        "Harga Sebelum Diskon: Rp%.2f\n" +
                        "Total Diskon: Rp%.2f\n" +
                        "Harga Setelah Diskon: Rp%.2f\n\n",
                this.nama, this.berat, this.harga,
                this.jumlah_beli, this.total, this.diskon,
                (this.total - this.diskon));
    }
}