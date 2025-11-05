package banka;

public class Doviz_Altın {
    private double tl;
    private double usd;
    private double eur;
    private double altin;

    private final double USD_KUR = 41.90;
    private final double EUR_KUR = 48.74;
    private final double ALTIN_KUR = 790.0;

    public Doviz_Altın(double tl, double usd, double eur, double altin) {
        this.tl = tl;
        this.usd = usd;
        this.eur = eur;
        this.altin = altin;
    }

    public void tlYatir(double miktar) {
        tl += miktar;
        System.out.println(miktar + " TL eklendi. Mevcut TL: " + tl);
    }

    public void tlCek(double miktar) {
        if (miktar <= tl) {
            tl -= miktar;
            System.out.println(miktar + " TL çekildi. Kalan TL: " + tl);
        } else {
            System.out.println("Yetersiz TL bakiyesi!");
        }
    }

    public void usdYatir(double miktar) {
        usd += miktar;
        System.out.println(miktar + " USD eklendi. Mevcut USD: " + usd);
    }

    public void eurYatir(double miktar) {
        eur += miktar;
        System.out.println(miktar + " EUR eklendi. Mevcut EUR: " + eur);
    }

    public void altinYatir(double miktar) {
        altin += miktar;
        System.out.println(miktar + " gram altın eklendi. Mevcut altın: " + altin + " gr");
    }

    public double toplamTL() {
        return tl + usd * USD_KUR + eur * EUR_KUR + altin * ALTIN_KUR;
    }

    public void bilgileriGoster() {
        System.out.println("\n----- DÖVİZ / ALTIN BİLGİLERİ -----");
        System.out.println("TL Bakiye: " + tl);
        System.out.println("USD Bakiye: " + usd + " (TL Karşılığı: " + (usd * USD_KUR) + ")");
        System.out.println("EUR Bakiye: " + eur + " (TL Karşılığı: " + (eur * EUR_KUR) + ")");
        System.out.println("Altın: " + altin + " gr (TL Karşılığı: " + (altin * ALTIN_KUR) + ")");
        System.out.println("Toplam Varlık (TL): " + toplamTL());
    }

    public void goster() {
        bilgileriGoster();
    }

    public double getTl() {
        return tl;
    }

    public double getUsd() {
        return usd;
    }

    public double getEur() {
        return eur;
    }

    public double getAltin() {
        return altin;
    }

    public void setTl(double tl) {
        this.tl = tl;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }

    public void setAltin(double altin) {
        this.altin = altin;
    }
}
