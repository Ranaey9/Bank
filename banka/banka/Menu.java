package banka;

import java.util.Scanner;

public class Menu {
    private final Scanner input;

    public Menu(Scanner input) {
        this.input = input;
    }

    public Menu(Scanner input, Varliklarim varliklarim) {
        this.input = input;
    }

    public void baslat(BankaHesabi aktifHesap, BankaHesabi hesap2) {
        boolean devam = true;

        while (devam) {
            System.out.println("\n=== BANKA MENÜ ===");
            System.out.println("1. Bakiye Sorgula");
            System.out.println("2. Para Yatır");
            System.out.println("3. Para Çek");
            System.out.println("4. Transfer Yap");
            System.out.println("5. Toplam Hesap Sayısı");
            System.out.println("6 - Varlıklarım / Borçlarım");
            System.out.println("7 - Son İşlemler");
            System.out.println("8 - Fatura Ödeme");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            int secim;
            if (input.hasNextInt()) {
                secim = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("Geçersiz giriş. Lütfen sayı girin.");
                input.nextLine();
                continue;
            }

            switch (secim) {
                case 1 -> aktifHesap.bakiyeSorgulama();
                case 2 -> {
                    System.out.print("Yatırılacak miktar: ");
                    if (input.hasNextDouble()) {
                        double yatir = input.nextDouble();
                        input.nextLine();
                        aktifHesap.paraYatırma(yatir);
                    } else {
                        System.out.println("Geçersiz miktar!");
                        input.nextLine();
                    }
                }
                case 3 -> {
                    System.out.print("Çekilecek miktar: ");
                    if (input.hasNextDouble()) {
                        double cek = input.nextDouble();
                        input.nextLine();
                        aktifHesap.ParaCekme(cek);
                    } else {
                        System.out.println("Geçersiz miktar!");
                        input.nextLine();
                    }
                }
                case 4 -> {
                    System.out.print("Transfer miktarı: ");
                    if (input.hasNextDouble()) {
                        double miktar = input.nextDouble();
                        input.nextLine();
                        aktifHesap.transfer(hesap2, miktar);
                    } else {
                        System.out.println("Geçersiz miktar!");
                        input.nextLine();
                    }
                }
                case 5 -> BankaHesabi.sumhesapNo();
                case 6 -> {
                   @SuppressWarnings("unused")
                   final Varliklarim varlik = new Varliklarim(200, 500);

                }
               case 7 -> aktifHesap.sonIslemler();
                case 8 -> {
                    System.out.println("Ödenecek fatura miktarını girin: ");
                    if (input.hasNextDouble()) {
                        double faturaMiktar = input.nextDouble();
                        input.nextLine();

                        System.out.println("Fatura türünü seçin:");
                        System.out.println("1. Elektrik");
                        System.out.println("2. Su");
                        System.out.println("3. İnternet");
                        System.out.println("4. TV");
                        System.out.print("Seçiminiz: ");
                        int faturaSecim = input.nextInt();
                        input.nextLine();

                        Fatura_Odeme fatura = null;
                        switch (faturaSecim) {
                            case 1 -> fatura = new Elektirik();
                            case 2 -> fatura = new Su();
                            case 3 -> fatura = new İnternet();
                            case 4 -> fatura = new TV();
                            case 5 -> fatura = new DogalGaz();
                            case 6 -> fatura = new Telefon();
                            default -> {
                                System.out.println("Geçersiz seçim!");
                                continue;
                            }
                        }
                        if (fatura != null) {
                            fatura.odeme(faturaMiktar, aktifHesap);
                        }
                    } else {
                        System.out.println("Geçersiz miktar!");
                        input.nextLine();
                    }
                }
                case 0 -> {
                    System.out.println("Çıkış yapılıyor...");
                    devam = false;
                }
                default -> System.out.println("Geçersiz seçim!");
            }
        }
    }
}
