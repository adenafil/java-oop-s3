package pt1;

import java.util.Scanner;

public class DaftarNilaiMahasiswaV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan banyak mahasiswa : ");
        int banyakMahasiswa = input.nextInt();

        Mahasiswa[] daftarMahasiwsa = new Mahasiswa[banyakMahasiswa];

        for (int i = 0; i < banyakMahasiswa; i++) {
            Mahasiswa mhs = new Mahasiswa();

            System.out.println("Masukan nama mahasiswa ke " + (i + 1) + " : " );
            mhs.nama = input.next();

            System.out.println("Masukan nilai  mahasiswa ke " + (i + 1) + " : ");
            mhs.nilai = input.nextInt();

            daftarMahasiwsa[i] = mhs;
        }

        boolean swapped = true;

        for (int i = 0; i < banyakMahasiswa && swapped; i++) {
            swapped = false;
            for (int j = 0; j < banyakMahasiswa - i - 1; j++) {
                if (daftarMahasiwsa[j].nilai > daftarMahasiwsa[j + 1].nilai) {
                    Mahasiswa temp = daftarMahasiwsa[j];
                    daftarMahasiwsa[j] = daftarMahasiwsa[j + 1];
                    daftarMahasiwsa[j + 1] = temp;

                    swapped = true;
                }
            }
        }

        for (int i = 0; i < banyakMahasiswa; i++) {
            Mahasiswa mhs = daftarMahasiwsa[i];
            System.out.println(
                (i + 1) + ". " + mhs.nama + " : " + mhs.nilai
            );
        }

        
    }
}

class Mahasiswa {
    String nama;
    int nilai;
    String nim;
    String alamat;

}

class ProgramStudi {
    String nama;
    String kode;
}

class Dosen {
    String nama;
    String nomorInduk;

    ProgramStudi prodi;
}
