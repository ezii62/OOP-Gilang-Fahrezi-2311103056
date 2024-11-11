package oop_2311103056_fahrezifikrialkhafid;

/**
 * @author Fahrezi Fikri Al Khafid 2311103056 SI07B
 */
public class Komputer {

    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;

    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }

    public void informasi() {
        System.out.println("\n==== " + namaWarnet + " ====");
        System.out.println("Jumlah PC: " + jumlahKomputer + " unit");
        System.out.println("Harga per jam: Rp." + (int) hargaPerJam);

        System.out.println("\nFasilitas Ruangan Standar:");
        System.out.println("* PC Gaming Spec");
        System.out.println("* Ruangan Full AC");
        System.out.println("* Free Air Mineral");
        System.out.println("* Internet 100 Mbps");
        System.out.println("* Kursi Gaming Standar");
    }
}
