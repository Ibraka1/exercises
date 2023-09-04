package QuestionBooks;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int sayi = input.nextInt();

        switch (sayi){
            case 1 :
                System.out.println("Sayi 1 e eşittir");
                break;
            case 2 :
                System.out.println("Sayi 2 e eşittir");
                break;
            case 3 :
                System.out.println("Sayi 3 e eşittir");
                break;
            case 4 :
                System.out.println("Sayi 4 e eşittir");
                break;
            default:
                System.out.println("!!! Lutfen gecerli bir sayi giriniz...");

        }






    }
}
