package pt5;

public class ProdukTest {
    public static void main(String[] args) {
        Produk tissue = new Produk("Tissue");
        tissue.setDeskripsi("Tissue Basah");
        tissue.setHargaAsli(99500);
        tissue.setHargaDiskon(69900);
        tissue.setKondisi(Produk.BARU);
        tissue.setMinimalPemesanan(1);
        tissue.addUlasan(
            new Ulasan(4, "Bagus")
        );
        tissue.addUlasan(
            new Ulasan(5, "Istimewa")
        );

        System.out.println(tissue.getPersentaseDiskon());
        System.out.println(tissue.getRating());
    }
}
