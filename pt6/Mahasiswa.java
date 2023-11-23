package pt6;

public class Mahasiswa extends Pengguna{
    String prodi;
    Dosen dosenWali;

    public Mahasiswa() {
        this("Mahasiswa");
    }

    public Mahasiswa(String nama) {
        super(nama);
    }

    public Mahasiswa(String nama, String prodi) {
        super(nama);
        this.prodi = prodi;
    }

    void doSomething() {
        // privateMethod();
        // System.out.println(privateInfo);
    }

    @Override
    void sayHello() {
        System.out.println(
            this.nama + " says Hello."
        );
    }

}
