package oop_2311103056_fahrezifikrialkhafid;

/**
 * @author Fahrezi Fikri Al Khafid 
 * 2311103056 
 * SI07B
 */

public class KomputerPremium extends Komputer {

    protected boolean ruangPrivat;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    public void informasiFasilitasPremium() {
        System.out.println("\nFasilitas Ruangan Premium:");
        System.out.println("* Ruangan Private (Max 5 orang)");
        System.out.println("* Ruangan Kedap Suara");
        System.out.println("* AC Individual");
        System.out.println("* Kursi Gaming Premium");
        System.out.println("* Internet 200 Mbps");
        System.out.println("* TV LED 50 inch");
        System.out.println("* Free 1 Snack & Minuman");
        System.out.println("* Status: " + (ruangPrivat ? "TERSEDIA" : "TIDAK TERSEDIA"));
    }

    public void pesan(int nomorKomputer) {
        System.out.println("\n==== Informasi Pemesanan ====");
        if (nomorKomputer <= jumlahKomputer) {
            System.out.println("Berhasil memesan PC-" + nomorKomputer);
            if (ruangPrivat) {
                System.out.println("* Anda mendapatkan ruang privat");
                System.out.println("* Silakan menuju ruang premium nomor " + ((nomorKomputer - 1) / 5 + 1));
                System.out.println("* Staff kami akan mengantar pesanan snack & minuman Anda");
            } else {
                System.out.println("* Silakan menuju PC-" + nomorKomputer + " di ruang standar");
            }
        } else {
            System.out.println("Maaf, PC-" + nomorKomputer + " tidak tersedia");
            System.out.println("Silakan pilih nomor PC 1-" + jumlahKomputer);
        }
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("\n==== Tambahan Layanan ====");
        System.out.println("Pesanan makanan & minuman:");
        System.out.println("* " + makanan);
        System.out.println("* " + minuman);
        System.out.println("Pesanan akan diantar ke tempat Anda");
    }
}
