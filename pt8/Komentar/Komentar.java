package Komentar;

import java.time.LocalDateTime;
import java.util.Date;

public class Komentar {
    String username;
    String teks;
    LocalDateTime date;

    public Komentar(String username, String teks, int year, int month, int dayOfMonth, int hour, int minute){
        this.username = username;
        this.teks = teks;
        this.date = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
    }

    public Komentar(String username, String teks) {
        this.username = username;
        this.teks = teks;
        this.date = LocalDateTime.now();
    }

    public String getUsername() {
        return username;
    }

    public String getTeks() {
        return teks;
    }

    public LocalDateTime getWaktuPembuatan() {
        return date;
    }



}
