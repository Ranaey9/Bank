package banka;

import java.util.ArrayList;

public class Yatirim_Urunleri {
    private double toplamDeger;
    private double getiriOrani;
    private ArrayList<String> islemler;

    public Yatirim_Urunleri() {
        this.toplamDeger = 0;
        this.getiriOrani = 0;
        this.islemler = new ArrayList<>();
    }

    public void yatirimEkle(double miktar, double orani, String urunAdi) {
        if (miktar <= 0) {
            System.out.println("Yatırım miktarı geçersiz!");
            return;
        }
        toplamDeger += miktar;
        getiriOrani = (getiriOrani + orani) / 2;
        islemler.add(urunAdi + " yatırımı yapıldı: +" + miktar + " TL, Getiri %" + orani);
        System.out.println(urunAdi + " yatırımına " + miktar + " TL eklendi. Yeni toplam: " + toplamDeger + " TL");
    }

    public void yatirimBoz(double miktar, String urunAdi) {
        if (miktar > toplamDeger) {
            System.out.println("Yetersiz yatırım değeri!");
            return;
        }
        toplamDeger -= miktar;
        islemler.add(urunAdi + " bozuldu: -" + miktar + " TL");
        System.out.println(urunAdi + " yatırımı bozuldu. Yeni toplam: " + toplamDeger + " TL");
    }

    public void getiriyiHesapla() {
        double getiri = toplamDeger * (getiriOrani / 100);
        toplamDeger += getiri;
        islemler.add("Yıllık getiri eklendi: +" + getiri + " TL");
        System.out.println("Yıllık getiri eklendi: " + getiri + " TL (Yeni toplam: " + toplamDeger + ")");
    }

    public void bilgiGoster() {
        System.out.println("\n--- YATIRIM ÜRÜNLERİ ---");
        System.out.println("Toplam yatırım değeri: " + toplamDeger + " TL");
        System.out.println("Ortalama getiri oranı: %" + getiriOrani);
        if (islemler.isEmpty()) {
            System.out.println("Henüz yatırım işlemi yapılmadı.");
        } else {
            System.out.println("\nİşlem geçmişi:");
            for (String i : islemler) {
                System.out.println(" - " + i);
            }
        }
    }

    public double getToplamDeger() {
        return toplamDeger;
    }

    public void setToplamDeger(double toplamDeger) {
        this.toplamDeger = toplamDeger;
    }

    public double getGetiriOrani() {
        return getiriOrani;
    }

    public void setGetiriOrani(double getiriOrani) {
        this.getiriOrani = getiriOrani;
    }

    public ArrayList<String> getIslemler() {
        return islemler;
    }
}
