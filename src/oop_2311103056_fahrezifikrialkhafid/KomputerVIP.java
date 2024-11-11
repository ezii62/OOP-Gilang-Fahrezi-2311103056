package oop_2311103056_fahrezifikrialkhafid;

/**
 * @author Fahrezi Fikri Al Khafid 
 * 2311103056 
 * SI07B
 */

public class KomputerVIP extends Komputer {

    protected boolean vipCard;

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    public void informasiBenefitVIP() {
        System.out.println("\nBenefit Member VIP:");
        System.out.println("* Diskon 10% setiap bermain");
        System.out.println("* Free snack setiap 2 jam bermain");
        System.out.println("* Prioritas booking PC");
        System.out.println("* Point reward setiap bermain");
        System.out.println("* Free upgrade ke ruang premium (jika tersedia)");
    }

    public void login(String username) {
        System.out.println("\n==== Informasi Login ====");
        System.out.println("Username: " + username);
        System.out.println("Status Member: " + (vipCard ? "VIP" : "Regular"));
        if (vipCard) {
            System.out.println("* VIP Card aktif!");
            System.out.println("* Benefit VIP akan otomatis diterapkan");
        } else {
            System.out.println("* Upgrade ke VIP untuk mendapatkan berbagai benefit!");
        }
        System.out.println("Login berhasil!");
        System.out.println("Selamat datang " + username);
    }

    public void bermain(int jam) {
        float total = hargaPerJam * jam;
        System.out.println("\n==== Informasi Bermain ====");
        if (vipCard) {
            float diskon = total * 0.1f;
            total = total - diskon;
            System.out.println("Durasi bermain: " + jam + " jam");
            System.out.println("Harga normal: Rp." + (int) (hargaPerJam * jam));
            System.out.println("Potongan VIP (10%): Rp." + (int) diskon);
            System.out.println("Total yang harus dibayar: Rp." + (int) total);
            System.out.println("* Anda mendapatkan " + (jam / 2) + " snack gratis!");
            System.out.println("* Points reward: +" + (jam * 10) + " points");
        } else {
            System.out.println("Durasi bermain: " + jam + " jam");
            System.out.println("Total yang harus dibayar: Rp." + (int) total);
        }
    }
}
