package banka;

public class Bes  {
    private double birikim;
    private double aylikKatki;
    private double devletKatkisi;
    private double getiriOrani;
    private int aySayisi;

    public Bes(double aylikKatki, double getiriOrani) {
        this.aylikKatki = aylikKatki;
        this.getiriOrani = getiriOrani;
        this.birikim = 0;
        this.devletKatkisi = 0;
        this.aySayisi = 0;
    }

    public void katkıEkle() {
        double devletPayi = aylikKatki * 0.30;
        birikim += aylikKatki + devletPayi;
        devletKatkisi += devletPayi;
        aySayisi++;
        System.out.println("Yeni katkı eklendi. Toplam birikim: " + birikim + " TL");
    }

    public void getiriyiHesapla() {
        double getiri = birikim * (getiriOrani / 100);
        birikim += getiri;
        System.out.println("Yıllık getiri eklendi: " + getiri + " TL (Yeni toplam: " + birikim + ")");
    }

    public void bilgiGoster() {
        System.out.println("\n--- BES Bilgileri ---");
        System.out.println("Toplam Birikim: " + birikim + " TL");
        System.out.println("Aylık Katkı: " + aylikKatki + " TL");
        System.out.println("Devlet Katkısı: " + devletKatkisi + " TL");
        System.out.println("Yıllık Getiri Oranı: %" + getiriOrani);
        System.out.println("Yatırım Süresi: " + aySayisi + " ay");
    }

    public double getBirikim() {
        return birikim;
    }

    public double getAylikKatki() {
        return aylikKatki;
    }

    public void setAylikKatki(double aylikKatki) {
        this.aylikKatki = aylikKatki;
    }

    public double getDevletKatkisi() {
        return devletKatkisi;
    }

    public double getGetiriOrani() {
        return getiriOrani;
    }

    public void setGetiriOrani(double getiriOrani) {
        this.getiriOrani = getiriOrani;
    }

    public int getAySayisi() {
        return aySayisi;
    }
}
