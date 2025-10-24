package banka;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Son_İslemler {
    private String tarih;
    private double tutar;
    private String aciklama;
    private static int sayac = 1;
    private int dekontNo;

    public Son_İslemler(double tutar, String aciklama) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.tarih = LocalDateTime.now().format(formatter);
        this.tutar = tutar;
        this.aciklama = aciklama;
        this.dekontNo = sayac++;
    }

    public int getDekontNo() {
        return dekontNo;
    }

    public void setDekontNo(int dekontNo) {
        this.dekontNo = dekontNo;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public void goster() {
        String islemTipi = (tutar >= 0) ? "Gelir" : "Gider";
        String aciklamaMetni = (tutar < 0) ? " | Açıklama: " + aciklama : "";
        System.out.println("Dekont No: " + dekontNo +
                " | Tarih: " + tarih +
                " | Tip: " + islemTipi +
                " |  Tutar: " + tutar + " TL" +
                aciklamaMetni);
    }

}
