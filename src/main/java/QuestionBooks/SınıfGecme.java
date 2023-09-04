package QuestionBooks;

import java.util.Scanner;

public class SınıfGecme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int turkce,matematik,fenBilgisi,sosyalBilgiler,bedenEgitimi;
        System.out.println("Turkce notunuzu giriniz :");
        turkce=input.nextInt();
        System.out.println("Matematik notunuzu giriniz :");
        matematik= input.nextInt();
        System.out.println("Fen Bilgisi notunuzu giriniz :");
        fenBilgisi=input.nextInt();
        System.out.println("Sosyal Bilgiler notunuzu giriniz :");
        sosyalBilgiler=input.nextInt();
        System.out.println("Beden Egitimi notunuzu giriniz :");
        bedenEgitimi=input.nextInt();

        double ortalama =(turkce+matematik+fenBilgisi+sosyalBilgiler+bedenEgitimi)/5;

        if (ortalama<0 && ortalama>100){
            System.out.println("Lutfen gecerli bir ortalama giriniz...");
        } else if (ortalama>=45) {
            System.out.println("Kosullu gectiniz");
        } else if (ortalama>=60) {
            System.out.println("Gectiniz");
        }else if (ortalama>=75){
            System.out.println("Basarili gectiniz");
        }else {
            System.out.println("Pek iyi Tebrikler");
        }

        System.out.println("Sınıf ortalamanız :" + ortalama);

    }
}
