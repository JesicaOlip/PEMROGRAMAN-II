package modul2.PRAK203_2510817120018_JesicaOliviaPutri;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        //Error: kurang tanda titik koma (;).
        //p1.nama = "Roi"
        p1.nama = "Roi";

        p1.asal = "Kingdom of Orvel";

        p1.setJabatan("Assasin");

        //Error: atribut umur belum diisi jadi bernilai 0, padahal output minta 17.
        p1.umur = 17;

        //Output disesuaikan dengan soal.
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        //Output disesuaikan dengan soal ditambahkan kata tahun.
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}