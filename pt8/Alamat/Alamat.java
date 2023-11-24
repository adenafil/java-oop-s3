package Alamat;
public class Alamat {
    String namaJalan;
    int rt;
    int rw;
    String kelurahan;
    String kabupaten;
    String provinsi;
    int kodePos;

    public Alamat(String namaJalan, int rt, int rw, String kelurahan, String kabupaten, String provinsi,
            int kodePos) {
        this.namaJalan = namaJalan;
        this.rt = rt;
        this.rw = rw;
        this.kelurahan = kelurahan;
        this.kabupaten = kabupaten;
        this.provinsi = provinsi;
        this.kodePos = kodePos;
    }

    public void Print() {
        System.out.println("Nama jalan : " + namaJalan);
        System.out.println("rt : " + rt);
        System.out.println("rw : " + rw);
        System.out.println("kelurahan : " + kelurahan);
        System.out.println("Kabupaten : " + kabupaten);
        System.out.println("provinsi : " + provinsi);
        System.out.println("kode pos : " + kodePos);
    }

    

    
}