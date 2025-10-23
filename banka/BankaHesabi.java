package banka;

import java.util.ArrayList;

public class BankaHesabi extends Musteri {
    final String hesapNo;
    private double bakiye;
    private static int sumhesapNo;
    private final Varliklarim varliklarim;

    public BankaHesabi(String name, String surname, String tcNo, String phoneNumber,
            String email, String password, String hesapNo, double bakiye) {
        super(name, surname, tcNo, phoneNumber, email, password, hesapNo);
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.varliklarim = new Varliklarim(bakiye, 0); // başlangıçta borç 0
        sumhesapNo++;
        System.out.println("Yeni hesap oluşturuldu. Hesap no: " + hesapNo);
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public Varliklarim getVarliklarim() {
        return varliklarim;
    }

    private final ArrayList<Son_İslemler> islemler = new ArrayList<>();

    // para yatırma
    public void paraYatırma(double amount) {
        bakiye += amount;
        varliklarim.setVarlikTL(bakiye);
        islemler.add(new Son_İslemler(amount, "para yatırma"));
        System.out.println(amount + " TL yatırıldı. Yeni bakiye: " + bakiye);
    }

    // para çekme
    public void ParaCekme(double amount) {
        if (amount <= bakiye) {
            bakiye -= amount;
            varliklarim.setVarlikTL(bakiye);
            islemler.add(new Son_İslemler(-amount, "para çekme"));
            System.out.println(amount + " TL çekildi. Yeni bakiye: " + bakiye);
        } else {
            System.out.println("Yetersiz bakiye. Mevcut bakiye: " + bakiye);
        }
    }

    // bakiye sorgulama
    public void bakiyeSorgulama() {
        System.out.println("Mevcut bakiye: " + bakiye);
    }

    // toplam hesap sayısı
    public static void sumhesapNo() {
        System.out.println("Toplam açılan hesap sayısı: " + sumhesapNo);
    }

    // transfer metodu
    public void transfer(BankaHesabi hedef, double miktar) {
        System.out.println("\n.  Transfer İşlemi Başlatılıyor   ");
        System.out.println("Gönderen: " + this.İsim + " (" + this.hesapNo + ")");
        System.out.println("Alıcı: " + hedef.İsim + " (" + hedef.hesapNo + ")");
        System.out.println("Gönderilecek miktar: " + miktar + " TL");

        if (miktar <= 0) {
            System.out.println("Transfer miktarı 0 veya negatif olamaz!");
            return;
        }

        if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye! Transfer başarısız.");
            return;
        }
        this.bakiye -= miktar;
        hedef.bakiye += miktar;
        this.varliklarim.setVarlikTL(bakiye);
        hedef.varliklarim.setVarlikTL(hedef.bakiye);
        System.out.println("Transfer başarılı! Yeni bakiye: " + bakiye);
        System.out.println("Transfer başarılı!");
        System.out.println("Yeni bakiye (" + this.hesapNo + "): " + bakiye + " TL");
        System.out.println("Yeni bakiye (" + hedef.hesapNo + "): " + hedef.bakiye + " TL");
    }

    public ArrayList<Son_İslemler> getIslemler() {
        return islemler;
    }
public void sonIslemler() {
    System.out.println("\n=== SON İŞLEMLER ===");
    if (islemler.isEmpty()) {
        System.out.println("Henüz işlem yapılmamış.");
        return;
    }
    for (Son_İslemler i : islemler) {
        i.goster();
    }
}

}
