package banka;

public class Voip {
    private double voipBakiye;
    private double dakikaFiyati;
    private int toplamDakika;
    private int aramaSayisi;

    public Voip(double baslangicBakiye, double dakikaFiyati) {
        this.voipBakiye = baslangicBakiye;
        this.dakikaFiyati = dakikaFiyati;
        this.toplamDakika = 0;
        this.aramaSayisi = 0;
    }

    public void aramaYap(int dakika) {
        double ucret = dakika * dakikaFiyati;
        if (ucret > voipBakiye) {
            System.out.println("Yetersiz VoIP bakiyesi! Lütfen bakiye yükleyin.");
            return;
        }
        voipBakiye -= ucret;
        toplamDakika += dakika;
        aramaSayisi++;
        System.out.println(dakika + " dakikalık arama yapıldı. Kalan bakiye: " + voipBakiye + " TL");
    }

    public void bakiyeYukle(double miktar) {
        if (miktar <= 0) {
            System.out.println("Geçersiz miktar!");
            return;
        }
        voipBakiye += miktar;
        System.out.println(miktar + " TL VoIP bakiyenize eklendi. Yeni bakiye: " + voipBakiye);
    }

    public void bilgiGoster() {
        System.out.println("\n--- VOIP Hesap Bilgileri ---");
        System.out.println("Bakiye: " + voipBakiye + " TL");
        System.out.println("Dakika başı ücret: " + dakikaFiyati + " TL");
        System.out.println("Toplam konuşma süresi: " + toplamDakika + " dk");
        System.out.println("Toplam arama sayısı: " + aramaSayisi);
    }

    public double getVoipBakiye() {
        return voipBakiye;
    }

    public double getDakikaFiyati() {
        return dakikaFiyati;
    }

    public void setDakikaFiyati(double dakikaFiyati) {
        this.dakikaFiyati = dakikaFiyati;
    }

    public int getToplamDakika() {
        return toplamDakika;
    }

    public int getAramaSayisi() {
        return aramaSayisi;
    }
}
