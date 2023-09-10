package AtmProject;

import java.util.Scanner;

public class Atm {
    /*   ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
                Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
                Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.
                Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
                Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,

      */
    String kartNumarasi = "1234 5678 9123 4567";

    private String sifre = "aA123456.";

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    int bakiye = 1000;


    public void start() {

        // Tüm müşterilerin ortak öz. tutacağımız bir user class oluşturalım.
        Scanner scan = new Scanner(System.in);
        // info objesi oluştrduk ve şimdi menüyü gösterelim.
        boolean isAgain = true;
        int select;
        int counter = 4;
        do {
            System.out.println("Lütfen kard numaranızı giriniz :");
            String cardNum = scan.nextLine();
            System.out.println("Lütfen şifrenizi giriniz :");
            String pwd = scan.next();
            if (cardNum.equals(kartNumarasi) && pwd.equals(sifre)) {
                System.out.println("Hoşgeldiniz");
                menu();
            } else {
                System.out.println("Hatalı giriş yaptınız.");
                counter--;
            }
            if (counter == 0) {
                System.out.println("Çok fazla yanlış giriş yaptınız ");
                System.out.println("Bankanızla iletişime geçiniz ");
                isAgain = false;
            }
        } while (isAgain);

    }

    private void menu() {
        boolean isAgain = true;
        Scanner inp = new Scanner(System.in);
        do{
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            System.out.println("1:Bakiye sorgula \n2:para yatirma \n3:para çekme \n4:para gönderme \n5:Şifre değiştirme \n6:Çıkış");
            int select = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Mevcut Bakiyeniz :" + bakiye + "$");
                    break;
                case 2:
                    System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz: ");
                    int put = inp.nextInt();
                    bakiye = bakiye + put;
                    System.out.println("İşleminiz gerçekleştiriliyor");
                    break;
                case 3:
                    System.out.println("Lütfen çekmek istediğiniz tutarı giriniz: ");
                    int pull = inp.nextInt();
                    if (pull > bakiye) {
                        System.out.println("Çekmek istediğiniz tutar bakiyenizde ki tutardan fazla olamaz ");
                        menu();
                    } else {
                        bakiye = bakiye - pull;
                        System.out.println("İşleminiz gerçekleştiriliyor");
                    }
                    break;
                case 4:
                    System.out.println("Para göndermek istediğiniz hesabın IBAN ını giriniz :");
                    String iban = inp.next();
                    boolean ibanCheck = iban.startsWith("TR");
                    int ibanlength = iban.length();
                    if (ibanCheck && ibanlength < 26)
                        System.out.println("Girilen iban hatalı !!");
                    else {
                        System.out.println("Girilen" + iban + "adresine göndermek istediğiniz tutarı giriniz :");
                        int ibanPull = inp.nextInt();
                        if (ibanPull > bakiye) {
                            System.out.println("Çekmek istediğiniz tutar bakiyenizde ki tutardan fazla olamaz ");
                            menu();
                        } else {
                            bakiye = bakiye - ibanPull;
                            System.out.println("işleminiz gerçekleştiriliyor.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Lütfen eski şifrenizi giriniz : ");
                    String pwdControl = inp.next();
                    if (pwdControl.equals(sifre)) {
                        System.out.println("Lütfen oluşturmak istediğiniz yeni şifreyi giriniz:");
                        String newpwd = inp.next();
                        setSifre(newpwd);
                        System.out.println("işleminiz gerçekleştiriliyor.");
                    } else {
                        System.out.println("Şifreniz Hatalı ");
                        isAgain = false;
                    }
                    break;
                case 6:
                    System.out.println("İyi günler dileriz");
                    isAgain = false;
                    break;
            }

        } while (isAgain) ;


    }
}