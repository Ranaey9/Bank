package banka;

public class Kredi_Hesaplama extends BankaHesabi implements Kredi_İslemleri {
    private double krediBorc;

    public Kredi_Hesaplama(String isim, String soyad, String tcNo, String telefon,
            String email, String sifre, String hesapNo, double bakiye) {
        super(isim, soyad, tcNo, telefon, email, sifre, hesapNo, bakiye);
        this.krediBorc = 0.0;
    }

    @Override
    public void krediCek(double miktar, int ay) {
        double faizOrani = 0.02;
        double toplamBorc = miktar + (miktar * faizOrani * ay);
        krediBorc += toplamBorc;
        paraYatırma(miktar);
        System.out.println("\n " + ay + " ay vadeli " + miktar + " TL kredi çekildi.");
        System.out.println("Faiz dahil toplam borç: " + toplamBorc + " TL");
        System.out.println("Aylık ödeme: " + (toplamBorc / ay) + " TL");
    }

    @Override
    public void krediOde(double miktar) {
        if (miktar <= krediBorc && miktar <= getBakiye()) {
            krediBorc -= miktar;
            ParaCekme(miktar);
            System.out.println(" " + miktar + " TL kredi borcu ödendi. Kalan borç: " + krediBorc + " TL");
        } else if (miktar > getBakiye()) {
            System.out.println(" Bakiyeniz bu ödemeyi karşılamıyor!");
        } else {
            System.out.println(" Ödeme tutarı borçtan fazla olamaz!");
        }
    }

    public double getKrediBorc() {
        return krediBorc;
    }

    public void krediDurumu() {
        System.out.println("Güncel kredi borcunuz: " + krediBorc + " TL");
    }
}
