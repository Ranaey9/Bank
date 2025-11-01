package banka;

public class Elektirik implements Fatura_Odeme {
    @Override
    public void odeme(double miktar, BankaHesabi hesap) {
        if (hesap.getBakiye() >= miktar) {
            hesap.paraCekFatura(miktar, "Elektrik faturası");
        } else {
            System.out.println("Yetersiz bakiye! Fatura ödenemedi.");
        }
    }
}