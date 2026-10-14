package modul3.soal1;

import java.util.Random;

public class Dadu {
    private int nilai;

    public Dadu(){
        this.nilai = acakNilai();
    }

    public int acakNilai(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public int getNilai(){
        return nilai;
    }
}