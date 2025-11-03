package banka;

public class Su implements Fatura_Odeme {
    @Override
    public void odeme(double miktar, BankaHesabi hesap) {
        if (hesap.getBakiye() >= miktar) {
            hesap.paraCekFatura(miktar, "Su faturası");
        } else {
            System.out.println("Yetersiz bakiye! Fatura ödenemedi.");
        }
    }
}