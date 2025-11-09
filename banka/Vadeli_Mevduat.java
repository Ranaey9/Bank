package banka;

public class Vadeli_Mevduat {
    private double bakiye;
    private double faizOrani;

    public Vadeli_Mevduat() {
        this.bakiye = 0;
        this.faizOrani = 0.15; 
    }

    public void paraYatir(double miktar) {
        bakiye += miktar;
        System.out.println(miktar + " TL vadeli mevduata yatırıldı. Yeni bakiye: " + bakiye);
    }

    public void paraCek(double miktar) {
        if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye!");
        } else {
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Kalan bakiye: " + bakiye);
        }
    }

    public void bakiyeSorgulama() {
        System.out.println("Vadeli mevduat bakiyesi: " + bakiye + " TL");
    }

    public void faizHesapla() {
        double faizGetirisi = bakiye * faizOrani;
        System.out.println("Bu dönemde kazanılacak faiz: " + faizGetirisi + " TL");
    }

    public void bilgiYazdir() {
        System.out.println("----- Vadeli Mevduat Bilgileri -----");
        System.out.println("Mevcut Bakiye: " + bakiye + " TL");
        System.out.println("Faiz Oranı: %" + (faizOrani * 100));
        double tahminiFaiz = bakiye * faizOrani;
        System.out.println("Tahmini Faiz Getirisi: " + tahminiFaiz + " TL");
    }

}
