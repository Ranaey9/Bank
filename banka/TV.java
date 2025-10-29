package banka;

public class TV implements Fatura_Odeme {

    @Override
    public void odeme(double miktar, BankaHesabi hesap) {
        if (hesap.getBakiye() >= miktar) {
            // Bakiye düşür
            hesap.paraCekFatura(miktar, "TV faturası");
        } else {
            System.out.println("Yetersiz bakiye! Fatura ödenemedi.");
        }
    }
}
