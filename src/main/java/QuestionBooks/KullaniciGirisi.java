package QuestionBooks;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kullaniciAdi,parola;
        System.out.print("Kullanici adini giriniz  :");
        kullaniciAdi= scan.nextLine();
        System.out.print("Sifrenizi giriniz :");
        parola=scan.nextLine();

        if (kullaniciAdi.equals("Admin") && parola.equals("Java123")){
            System.out.println("Hosgeldiniz");
        }else {
            System.out.println("Kullanici adınız veya parolaniz yanlis !!");
        }





    }
}
