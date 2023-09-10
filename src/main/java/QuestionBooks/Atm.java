package QuestionBooks;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int bakiye = 1000, input,miktar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Merhaba QA 03 Banka Hoşgeldiniz ! ");
        System.out.println("Güncel Bakiyeniz : "+bakiye+ " TL");
        while(bakiye>0){
            System.out.println();
            System.out.println("1 : Para Yatır");
            System.out.println("2 : Para Çekme");
            System.out.println("3 : Bakiye Sorgula");
            System.out.println("4 : Hesaptan Çıkış Yapma ");
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            input= scan.nextInt();
            if (input==1){
                System.out.println("Yatırmak istediğiniz miktar :");
                miktar= scan.nextInt();
                bakiye=bakiye+miktar;
            } else if (input==2) {
                System.out.println("Lütfen çekmek istediğiniz miktarı giriniz : ");
                miktar=scan.nextInt();
                if (miktar>bakiye){
                    System.out.println("Çekmek istediğiniz tutar bakiyenizden fazladır !!! ");
                }else bakiye-=miktar;
            } else if (input==3) {
                System.out.println("Mevcut Bakiyeniz : "+bakiye + "TL");
            } else if (input==4) {
                System.out.println("Çıkış yapılıyor...");
                break;
            }else System.out.println("Hatalı giriş \nLütfen geçerli bir işlem seçiniz");
        }
        System.out.println("İyi Günler QA 03 Banka Tekrar Bekleriz...");
    }
}
