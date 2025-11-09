package banka;

public class Portfoyum extends BankaHesabi {
    private Nakit nakit;
    private Hisse hisse;
    private static Fon fon;
    private Vadeli_Mevduat vadeliMevduat;
    private Doviz_Altın dovizAltın;
    private Bes bes;
    private Voip voip;
    private Yatirim_Urunleri yatirimUrunleri;
    private Diger_Banka_Hesaplari digerBankaHesaplari;

    public Portfoyum(BankaHesabi aktifHesap) {
        super(
                aktifHesap.getİsim(),
                aktifHesap.getSoyad(),
                aktifHesap.getTcNo(),
                aktifHesap.getE_mail(),
                aktifHesap.getSifre(),
                aktifHesap.getHesapNo(),
                aktifHesap.getBakiye());

        this.nakit = new Nakit(getBakiye(), 0);
        this.hisse = new Hisse();
        this.fon = new Fon( getİsim(), getTcNo(), getSoyad(), getE_mail(), getSifre(), getHesapNo(),
                getBakiye());
        this.vadeliMevduat = new Vadeli_Mevduat();
        this.dovizAltın = new Doviz_Altın(bakiye, bakiye, bakiye, bakiye);
        this.bes = new Bes(getBakiye(), getBakiye());
        this.voip = new Voip(50.0, 0.2);
        this.yatirimUrunleri = new Yatirim_Urunleri();
        this.digerBankaHesaplari = new Diger_Banka_Hesaplari();
    }

    public void portfoyMenusu() {
        System.out.println("\n=== PORTFÖY MENÜSÜ ===");
        System.out.println("Hesap Sahibi: " + getİsim() + " " + getSoyad());
        System.out.println("Bakiye: " + getBakiye() + " TL");
        System.out.println("1 - Nakit Durumu");
        System.out.println("2 - Hisse Bilgileri");
        System.out.println("3 - Fon Bilgileri");
        System.out.println("4 - Döviz / Altın Bilgileri");
        System.out.println("0 - Geri Dön");
    }

    public Nakit getNakit() {
        return nakit;
    }

    public void setNakit(Nakit nakit) {
        this.nakit = nakit;
    }

    public Hisse getHisse() {
        return hisse;
    }

    public void setHisse(Hisse hisse) {
        this.hisse = hisse;
    }

    public static Fon getFon() {
        return fon;
    }

    public void setFon(Fon fon) {
        this.fon = fon;
    }

    public Vadeli_Mevduat getVadeliMevduat() {
        return vadeliMevduat;
    }

    public void setVadeliMevduat(Vadeli_Mevduat vadeliMevduat) {
        this.vadeliMevduat = vadeliMevduat;
    }

    public Doviz_Altın getDovizAltın() {
        return dovizAltın;
    }

    public void setDovizAltın(Doviz_Altın dovizAltın) {
        this.dovizAltın = dovizAltın;
    }

    public Bes getBes() {
        return bes;
    }

    public void setBes(Bes bes) {
        this.bes = bes;
    }

    public Voip getVoip() {
        return voip;
    }

    public void setVoip(Voip voip) {
        this.voip = voip;
    }

    public Yatirim_Urunleri getYatirimUrunleri() {
        return yatirimUrunleri;
    }

    public void setYatirimUrunleri(Yatirim_Urunleri yatirimUrunleri) {
        this.yatirimUrunleri = yatirimUrunleri;
    }

    public Diger_Banka_Hesaplari getDigerBankaHesaplari() {
        return digerBankaHesaplari;
    }

    public void setDigerBankaHesaplari(Diger_Banka_Hesaplari digerBankaHesaplari) {
        this.digerBankaHesaplari = digerBankaHesaplari;
    }
}
