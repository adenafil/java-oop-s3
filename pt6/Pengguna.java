package pt6;

public class Pengguna {
    String email;
    String password;
    String nama;
    String nomorInduk;
    private String privateInfo = "Info Privat";

    public Pengguna(String nama) {
        this.nama = nama;
    }

    void sayHello() {
        System.out.println("hello");
        System.out.println(privateInfo);
        privateMethod();
    }

    final void sayHI() {
        System.out.println("Hi");
    }

    private void privateMethod() {

    }
}
