package pt5;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Ulasan {
    int rating;
    String review;
    Date waktuReviewDibuat;
    Pengguna pembuat;
    Set<Pengguna> penggunaTerbantu = new HashSet<>();
    String balasanPenjual;
    Date wakatuBalasanDiBuat;

    public Ulasan(int rating, String review) {
        this.rating = rating;
        this.review = review;
        this.wakatuBalasanDiBuat = new Date();
    }
}
