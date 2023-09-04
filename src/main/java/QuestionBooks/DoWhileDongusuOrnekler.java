package QuestionBooks;

import java.util.Scanner;

public class DoWhileDongusuOrnekler {
    public static void main(String[] args) {
        // Örnek Negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift sayıları toplayan program

        Scanner input = new Scanner(System.in);
        int sayi1,sum=0;


        do {
            System.out.println("Lütfen bir sayi giriniz : ");
            sayi1=input.nextInt();
            if (sayi1%2==0){
                sum+=sayi1;
            }
        }while(sayi1>=0);
        System.out.println(sum);

    }
}
