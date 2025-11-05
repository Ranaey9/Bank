package banka;

import java.util.ArrayList;

public class Diger_Banka_Hesaplari {
    private ArrayList<String> hesaplar = new ArrayList<>();

    public void hesapEkle(String bankaAdi, String iban) {
        hesaplar.add(bankaAdi + " - " + iban);
        System.out.println(bankaAdi + " bankasına ait hesap eklendi.");
    }

    public void hesaplariListele() {
        System.out.println("\n----- DİĞER BANKA HESAPLARI -----");
        if (hesaplar.isEmpty()) {
            System.out.println("Henüz başka banka hesabı eklenmemiş.");
        } else {
            for (String h : hesaplar) {
                System.out.println(h);
            }
        }
    }

    public void bilgileriGoster() {
        System.out.println("\n------DİĞER BANKA HESAPLARI BİLGİLERİ ------");
        if (hesaplar.isEmpty()) {
            System.out.println("Kayıtlı banka hesabı bulunmuyor.");
        } else {
            for (int i = 0; i < hesaplar.size(); i++) {
                System.out.println((i + 1) + ". " + hesaplar.get(i));
            }
        }
    }
}
