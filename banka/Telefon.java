package banka;

public class Telefon implements Fatura_Odeme {
    @Override
    public void odeme(double miktar, BankaHesabi hesap) {
        if (hesap.getBakiye() >= miktar) {
            hesap.paraCekFatura(miktar, "Telefon faturası");
        } else {
            System.out.println("Yetersiz bakiye! Fatura ödenemedi.");
        }
    }
}