package QuestionBooks;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        int tahmin,can=5,i=0;
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int sayi = random.nextInt(100);
        boolean oyunDurum=false;
        int []tahminler = new int[5];

        System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz ");
        System.out.println("0-99 Arasında bir sayi arıyoruz ");
        while(can>0) {
            System.out.println("Tahmininiz : ");
            tahmin = scan.nextInt();
            tahminler[i++]=tahmin;
            if (tahmin < 0 || tahmin > 99) {
                System.out.println("Girdiğiniz sayi 0-99 arası bir sayi giriniz ");
                continue;
            }
            if (tahmin == sayi) {
                oyunDurum = true;
                break;
            } else {
                System.out.println("Kaybettiniz :( Kalan Can = " + --can);
            }
            if (oyunDurum) {
                System.out.println("Tebrikler doğru tahmin");
                System.out.println("Sayımız :" + sayi);
                System.out.println("Kalan can " + can);
            } else System.out.println("Yanlış Tahmin ");
        }
        System.out.println("Tahminleriniz :");
        for (int w:tahminler) {
            System.out.print(w+"-");
        }
    }
}
