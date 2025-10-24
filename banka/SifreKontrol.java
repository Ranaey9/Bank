package banka;

public class SifreKontrol {
    public static boolean SifreKontrol(String girilenSifre, String dogruSifre) {
        if (girilenSifre.length() != dogruSifre.length()) {
            return false;
        }
        for (int i = 0; i < girilenSifre.length(); i++) {
            char c1 = girilenSifre.charAt(i);
            char c2 = dogruSifre.charAt(i);
            if (c1 >= 'A' && c1 <= 'Z') {
                c1 = (char) (c1 + 32);
            }
            if (c2 >= 'A' && c2 <= 'Z') {
                c2 = (char) (c2 + 32);
            }
            // rakam kontorlü
            if ((c1 >= '0' && c1 <= '9') || (c2 >= '0' && c2 <= '9')) {
                if (c1 != c2)
                    return false;
                continue; 
            }
            // harf için kontrol
            if (c1 != c2)
                return false;
        }
        return true;
    }
}
