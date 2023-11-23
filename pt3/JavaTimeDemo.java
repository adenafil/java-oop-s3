package pt3;

import java.time.LocalDate;
import java.util.Date;

public class JavaTimeDemo {
    public static void main(String[] args) {
        Waktu pagi = new Waktu(7, 30, 56);
        Waktu siang = Waktu.buat(12, 30, 45);
        Waktu malam = Waktu.buat(23, 56, 59);

        print(pagi);
        print(siang);
        print(malam);

        Date date = new Date(99, 9, 25);
        System.out.println(date);

        LocalDate localDate = LocalDate.of(1999, 10, 25);
        System.out.println(localDate);

    }

    static void print(Waktu waktu) {
        System.out.printf(
            "%02d:%02d:%02d\n",
            waktu.jam, waktu.menit, waktu.detik
        );
    }
}
