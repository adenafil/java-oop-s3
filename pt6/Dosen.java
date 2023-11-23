package pt6;

import java.util.List;

public class Dosen extends Pengguna {
    String prodi;
    List<Mahasiswa> mahasiswaWali;

    public Dosen(String nama) {
        super(nama);
    }
}
