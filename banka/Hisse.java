package banka;

public class Hisse {
    private String hisseAdi1;
    private int adet1;

    private String hisseAdi2;
    private int adet2;

    private String hisseAdi3;
    private int adet3;

    public Hisse() {
        this.hisseAdi1 = "HisseA";
        this.adet1 = 10;

        this.hisseAdi2 = "HisseB";
        this.adet2 = 20;

        this.hisseAdi3 = "HisseC";
        this.adet3 = 30;

    }

    public void hisseEkle(String ad, int adet) {
        if (adet <= 0)
            return;

        if (hisseAdi1.isEmpty()) {
            hisseAdi1 = ad;
            adet1 = adet;
        } else if (hisseAdi2.isEmpty()) {
            hisseAdi2 = ad;
            adet2 = adet;
        } else if (hisseAdi3.isEmpty()) {
            hisseAdi3 = ad;
            adet3 = adet;
        } else {
            System.out.println("En fazla 3 hisse eklenebilir .");
        }
        System.out.println(adet + " adet " + ad + " eklendi.");
    }

    public void hisseSat(String ad, int adet) {
        if (hisseAdi1.equals(ad)) {
            if (adet > adet1) {
                System.out.println("Yeterli hisse yok!");
                return;
            }
            adet1 -= adet;
            System.out.println(adet + " adet " + ad + " satıldı.");
            if (adet1 == 0)
                hisseAdi1 = "";
        } else if (hisseAdi2.equals(ad)) {
            if (adet > adet2) {
                System.out.println("Yeterli hisse yok!");
                return;
            }
            adet2 -= adet;
            System.out.println(adet + " adet " + ad + " satıldı.");
            if (adet2 == 0)
                hisseAdi2 = "";
        } else if (hisseAdi3.equals(ad)) {
            if (adet > adet3) {
                System.out.println("Yeterli hisse yok!");
                return;
            }
            adet3 -= adet;
            System.out.println(adet + " adet " + ad + " satıldı.");
            if (adet3 == 0)
                hisseAdi3 = "";
        } else {
            System.out.println(ad + " portföyde yok!");
        }
    }

    public void goster() {
        System.out.println("\n=== HISSE PORTFOYÜ ===");
        if (!hisseAdi1.isEmpty())
            System.out.println(hisseAdi1 + " : " + adet1 + " adet");
        if (!hisseAdi2.isEmpty())
            System.out.println(hisseAdi2 + " : " + adet2 + " adet");
        if (!hisseAdi3.isEmpty())
            System.out.println(hisseAdi3 + " : " + adet3 + " adet");
        if (hisseAdi1.isEmpty() && hisseAdi2.isEmpty() && hisseAdi3.isEmpty())
            System.out.println("Hiç hisse yok.");
    }
}
