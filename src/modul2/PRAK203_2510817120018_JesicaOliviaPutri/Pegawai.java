package modul2.PRAK203_2510817120018_JesicaOliviaPutri;

//Error: nama class tidak sama dengan nama file dan nama yang dipanggil di Soal3Main.
//public class Employee {
public class Pegawai {
    public String nama;

    //Error: char hanya menyimpan 1 karakter, sedangkan asal isinya teks.
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //Error: variabel j tidak ada karena method tidak punya parameter.
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}