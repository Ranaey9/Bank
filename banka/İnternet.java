package banka;

public class İnternet implements Fatura_Odeme {
    @Override
    public void odeme(double miktar, BankaHesabi hesap) {
        if (hesap.getBakiye() >= miktar) {
            hesap.paraCekFatura(miktar, "İnternet faturası");
        } else {
            System.out.println("Yetersiz bakiye! Fatura ödenemedi.");
        }
    }
}