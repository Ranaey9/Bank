package banka;

import banka.Varliklarim;

public class Nakit {
    private Varliklarim varliklarim;

    public Nakit(double mevcutTL, double borcTL) {
        this.varliklarim = new Varliklarim(mevcutTL, borcTL);
    }

    public void paraYatir(double miktar) {
        if (miktar > 0) {
            double yeniTL = varliklarim.toplamVarlik() + miktar;
            varliklarim.setVarlikTL(yeniTL);
            System.out.println(miktar + " TL yatırıldı.");
            goster();
        } else {
            System.out.println("Yatırılacak miktar 0 veya negatif olamaz!");
        }
    }

    public boolean paraCek(double miktar) {
        if (miktar > 0 && miktar <= varliklarim.toplamVarlik()) {
            double yeniTL = varliklarim.toplamVarlik() - miktar;
            varliklarim.setVarlikTL(yeniTL);
            System.out.println(miktar + " TL çekildi.");
            goster();
            return true;
        } else {
            System.out.println("Yetersiz bakiye veya geçersiz miktar!");
            return false;

        }
    }

    public void goster() {
        varliklarim.goster();
    }

    public double getTL() {
        return varliklarim.toplamVarlik();
    }

    public void setTL(double miktar) {
        varliklarim.setVarlikTL(miktar);
    }
}
