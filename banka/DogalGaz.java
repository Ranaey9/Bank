package banka;

public class DogalGaz implements Fatura_Odeme {

    @Override
    public void odeme(double miktar, BankaHesabi hesap) {
        if (hesap.getBakiye() >= miktar) {
            hesap.paraCekFatura(miktar, "Doğalgaz faturası");
        } else {
            System.out.println("Yetersiz bakiye! Fatura ödenemedi.");
        }
    }
}