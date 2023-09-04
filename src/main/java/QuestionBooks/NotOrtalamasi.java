package QuestionBooks;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        // verilen notlara  göre öğrencinin not  ortalamasini hesaplayan kodu yazdiriniz. quiz %20 + vize %35 + final %45

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen quiz notunuzu giriniz:");
        int quiz = input.nextInt();
        System.out.println("Lutfen vize notunuzu giriniz:");
        int vize = input.nextInt();
        System.out.println("Lutfen final notunuzu giriniz:");
        int finalExam = input.nextInt();

        double yourNote = (quiz*0.2)+(vize*0.35)+(finalExam*0.45);
        System.out.println("Not ortalamanız :"+yourNote);

        if (yourNote>40){
            System.out.println("Tebrikler dersi geçtiniz :)");
        }else if (yourNote>30 && yourNote <=40 ){
            System.out.println("Koşullu geçtiniz !!");
        }else  {
            System.out.println("Kaldınız...");
        }













    }
}
