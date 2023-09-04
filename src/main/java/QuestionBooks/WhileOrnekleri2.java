package QuestionBooks;

import java.util.Scanner;

public class WhileOrnekleri2 {
    public static void main(String[] args) {
        // Örnek 1 Faktöriyel Hesaplama
        // Örnek 2 Harmonik sayılar
        // Örnek 3 Yıldızlar ile üçgen yapımı
        // Örnek 4 üslü sayı hesaplama


        // Faktöriyel
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen faktöriyelini hesaplamak istediğiniz sayiyi giriniz...");
        int sayi ;
        int multiply = 1;
        sayi=scan.nextInt();
        while(sayi>0){
            multiply=multiply*sayi;
            sayi--;
        }
        System.out.println(multiply);

         */

        // Harmonik Sayılar 1+1/2+1/3+1/4....1/n
      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Harmonik sayısını giriniz...");
        double sayi2=scan.nextDouble();
        double harmonic = 0;
        while(sayi2>0) {
            harmonic=harmonic+1/sayi2;
            sayi2--;
        }
        System.out.println(harmonic);

       */
        // Yıldızlarla Üçgen oluşturma
      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Yıldız sayısını giriniz...");
        int star =scan.nextInt();
        int i = 1;
        while(i<=star){
            int k = 1;
            while(k<=i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }

       */
        // üslü sayı hesaplama
        Scanner scan = new Scanner(System.in);
        System.out.println("Hesaplamak istediğiniz üslü sayiyi giriniz.");
        int taban = scan.nextInt();
        System.out.println("Üslü sayının kuvvetini giriniz.");
        int sonuc =1;
        int us = scan.nextInt();
        int i =1;
        while(i<=us){
            sonuc = sonuc*taban;
            i++;
        }
        System.out.println(sonuc);



    }
}
