package QuestionBooks;

import java.util.Scanner;

public class ContinueAndBreak {
    public static void main(String[] args) {
        // break    => döngüyü durdurur
        // continue => döngüyü durdurmaz ama bir sonraki adıma gider

        Scanner scan = new Scanner(System.in);
        int sayi;
        while(true) {
            System.out.println("Bir sayı giriniz...");
            sayi=scan.nextInt();
            if (sayi==0){
                System.out.println("Döngü bitti");
                break;
            }
            System.out.println(sayi);
        }



    }
}
