package banka;

public class Musteri {
    String İsim;
    String Soyad;
    String tcNo;
    String telefonNo;
    String e_mail;
    String Sifre;

    public Musteri(String İsim, String Soyad, String tcNo, String phoneNumber, String email, String Sifre, String telefonNo) {
        this.İsim = İsim;
        this.Soyad = Soyad;
        this.tcNo = tcNo;
        this.telefonNo = telefonNo;
        this.e_mail = email;
        this.Sifre = Sifre;
    }

    public String getİsim() {
        return İsim;
    }

    public String getSoyad() {
        return Soyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getSifre() {
        return Sifre;
    }
}
