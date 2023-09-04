package QuestionBooks;

import java.util.Scanner;

public class WhileOrnekler {
    public static void main(String[] args) {
        // 1.Örnek 1 den 100 e kadar çift sayılari ekrana yazan program
        // 2.Örnek Negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden  ve girilen değerlerden tek sayıları toplayan program
        // 3.Girilen sayıya kadar olan 2 nin kuvvetleri


        // 1. Örnek kodları
//      int i =1 ;
//      while (i<=100) {
//          if (i%2==0){
//              System.out.println(i);
//          }
//          i++;
//      }

        // 2. Örnek kodları
  //      Scanner scan = new Scanner(System.in);
//
  //      int toplam = 0;
  //      int input ;
  //
  //      while(true){
  //          System.out.println("Lutfen bir sayı giriniz");
  //          input=scan.nextInt();
  //          if (input<0){
  //              System.out.println("Program sonlandı negatif sayı girdiniz!! "+"\nGirilen tek sayılar toplamı : "+toplam);
  //              break;
  //          }
  //          if (input%2==1){
  //              toplam+=input;
  //          }
  //      }

        // 3. Örnek
        Scanner scan1= new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        int input = scan1.nextInt();
        int k =1;
        while(k<input+1){
            System.out.println(k);
            k=k*2;
        }




    }
}
