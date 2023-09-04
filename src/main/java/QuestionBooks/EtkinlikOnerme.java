package QuestionBooks;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        /*
        Hava sıcaklığını al
        sıcaklık 30 veya daha fazla ise yüzme etkinliği
        5 ve 30 arasında ise sinema
        4 veya daha az ise kayak yapmayı öner
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen hava sıcaklıgını giriniz : ");
        double tempreture = input.nextDouble();
        if (tempreture>30){
            System.out.println("Bu sıcaklıkta en iyi aktivite = Yüzme ");
        } else if (tempreture>5 && tempreture<=30) {
            System.out.println("Bu sıcaklıkta en iyi aktivite = Sinema");
        }else System.out.println("Bu sıcaklıkta en iyi aktivite = Kayak ");
    }
}
