package oop_2311103056_fahrezifikrialkhafid;

/**
 * @author Fahrezi Fikri Al Khafid 
 * 2311103056 
 * SI07B
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("\n=============================================================");
        System.out.println("TEST CASE 1: User dengan VIP Card dan Ruang Premium (Private)");
        System.out.println("=============================================================");

        Komputer kompInfo = new Komputer(20, "TelkomNET", 8000);
        kompInfo.informasi();  

        KomputerPremium kompPremium = new KomputerPremium(10, "TelkomNET Premium", 15000, true);
        kompPremium.informasiFasilitasPremium();

        KomputerVIP kompVIP = new KomputerVIP(20, "TelkomNET", 8000, true);
        kompVIP.informasiBenefitVIP();

        kompVIP.login("Fahrezi");
        kompVIP.bermain(3);

        kompPremium.pesan(5);
        kompPremium.tambahLayanan("Nasi Ayam Geprek", "Es Teh");

        System.out.println("\n=============================================================");
        System.out.println("TEST CASE 2: User tanpa VIP Card dan Ruang Premium (Private)");
        System.out.println("=============================================================");

        kompInfo.informasi();  

        KomputerPremium kompPremium2 = new KomputerPremium(10, "TelkomNET Premium", 15000, false);
        kompPremium2.informasiFasilitasPremium();

        KomputerVIP kompVIP2 = new KomputerVIP(20, "TelkomNET", 8000, false);
        kompVIP2.informasiBenefitVIP();

        kompVIP2.login("Fahrezi");
        kompVIP2.bermain(3);

        kompPremium2.pesan(5);
        kompPremium2.tambahLayanan("Nasi Ayam Geprek", "Es Teh");
    }
}
