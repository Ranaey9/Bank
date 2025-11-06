package banka;

public class Fon {

    private double hisseFon;
    private double tahvilFon;
    private double karmaFon;
    private double likiditeFon;
    private double altinFon;

    public Fon(String isim, String tcNo, String soyad, String e_mail, String sifre, String hesapNo, double bakiye) {
        this.hisseFon = 2500.0;
        this.tahvilFon = 1500.0;
        this.karmaFon = 1000.0;
        this.likiditeFon = 750.0;
        this.altinFon = 500.0;
    }

    public double getHisseFon() {
        return hisseFon;
    }

    public void setHisseFon(double hisseFon) {
        this.hisseFon = hisseFon;
    }

    public double getTahvilFon() {
        return tahvilFon;
    }

    public void setTahvilFon(double tahvilFon) {
        this.tahvilFon = tahvilFon;
    }

    public double getKarmaFon() {
        return karmaFon;
    }

    public void setKarmaFon(double karmaFon) {
        this.karmaFon = karmaFon;
    }

    public double getLikiditeFon() {
        return likiditeFon;
    }

    public void setLikiditeFon(double likiditeFon) {
        this.likiditeFon = likiditeFon;
    }

    public double getAltinFon() {
        return altinFon;
    }

    public void setAltinFon(double altinFon) {
        this.altinFon = altinFon;
    }

    public double toplamFonDegeri() {
        return hisseFon + tahvilFon + karmaFon + likiditeFon + altinFon;
    }

    public void fonBilgisiGoster() {
        System.out.println("=== Fon Portföyü ===");
        System.out.println("Hisse Fonu: " + hisseFon + " TL");
        System.out.println("Tahvil Fonu: " + tahvilFon + " TL");
        System.out.println("Karma Fonu: " + karmaFon + " TL");
        System.out.println("Likidite Fonu: " + likiditeFon + " TL");
        System.out.println("Altın Fonu: " + altinFon + " TL");
        System.out.println("Toplam Fon Değeri: " + toplamFonDegeri() + " TL");
    }
}
