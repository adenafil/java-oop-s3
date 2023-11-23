package pt1;
import java.util.Scanner;

public class DaftarNilaiMahasiswa {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Masukan Banyak Masiswa");
            int banyakMahasiswa = scanner.nextInt();

            String[] daftarNama = new String[banyakMahasiswa];
            int[] daftarNilai = new int[banyakMahasiswa];

            for (int i = 0; i < banyakMahasiswa; i++) {
                System.out.println("Masukan nama mahasiswa ke - " + (i+1) + ": ");
                String nama = scanner.next();
                daftarNama[i] = nama;

                System.out.println("Masukan nilai mahasiswa ke- " + (i + 1) + ": ");
                int nilai = scanner.nextInt();
                daftarNilai[i] = nilai;
            }

            // Sort daftar nilai dari yang terkecil -> terbesar

            boolean swapped = true;
            for (int i = 0; i < banyakMahasiswa && swapped; i++) {
                swapped = false;
                for (int j = 0; j < banyakMahasiswa - i - 1; j++) {
                    if (daftarNilai[j] > daftarNilai[j+1]) {
                        int temp = daftarNilai[j];
                        daftarNilai[j] = daftarNilai[j+1];
                        daftarNilai[j+1] = temp;

                        String tempNama = daftarNama[i];
                        daftarNama[j] = daftarNama[j+1];
                        daftarNama[j+1] = tempNama;

                        swapped = true;
                    }
                }
            }

            for (int i = 0; i < banyakMahasiswa; i++) {
                System.out.println(
                    (i + 1) + ". " + daftarNama[i] + " : " + daftarNilai[i]
                );
            }
        }
    }
}