import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String secim;
        String kullaniciAdi, sifre, yeniSifre;

        System.out.print("Luften Kullanici adinizi giriniz : ");
        kullaniciAdi = scan.nextLine();

        System.out.print("Lutfen Sifrenizi giriniz : ");
        sifre = scan.nextLine();

        if (kullaniciAdi.equals("mert29")) {
            if (sifre.equals("292929")) {
                System.out.println("Basarili bir sekilde giris yaptiniz.");
            } else {
                System.out.println("Yanlis sifre girdiniz.");
                System.out.println("Sifrenizi sifirlamak icin 1|Mevcut sifre ile devam etmek icin 2'e basiniz.");
                secim = scan.nextLine();
                if (secim.equals("1")) {
                    System.out.print("Yeni Sifrenizi giriniz : ");
                    yeniSifre = scan.nextLine();

                    if (yeniSifre.equals("292929")||yeniSifre.equals(sifre)) {
                        System.out.println("Sifre Olusturulamadi.Lutfen baska sifre giriniz.");
                    } else
                        System.out.println("Sifre olusturuldu.");
                }
                if (secim.equals("2")) {
                    System.out.println("Mevcut sifre ile devam edebilirsiniz.");
                }
            }
        }
    }
}
