package pt6;

public class PenggunaTest {
    public static void main(String[] args) {
        // Pengguna p = new Pengguna();
        // Dosen d = new Dosen();
        // TenagaKependidikan t = new TenagaKependidikan();

        Pengguna p = new Pengguna("Pengguna");
        p.sayHello();
        p.sayHI();
        
        Mahasiswa m = new Mahasiswa();
        m.sayHello();
        m.sayHI();
    }
}
