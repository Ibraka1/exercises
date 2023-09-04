package BasicLibraryApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Library {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            boolean isAgain =true;
            List<String> booksName = new ArrayList<>();
            booksName.add("Kızıl Veba");
            booksName.add("Satranç");
            booksName.add("Fahrenheit 451");
            booksName.add("Körlük");
            booksName.add("Sırça Köşk");

            do {
                System.out.println("--- Lütfen yapmak istediğiniz işlemi seçiniz");
                System.out.println("1 : Kitap Ekleme");
                System.out.println("2 : Kitap Silme ");
                System.out.println("3 : Kitap Sıralama");
                System.out.println("4 : Bütün Kitapları Silme");
                System.out.println("5 : Çıkış yapma ");

                int userChoise = scan.nextInt();
                switch (userChoise) {
                    case 1:
                        System.out.println("Lütfen eklemek istediğiniz kitabin adını giriniz :" );
                        booksName.add(scan.nextLine());
                        System.out.println(booksName);
                        break;
                    case 2 :
                        System.out.println("Lütfen silmek istediğiniz kitabin adını giriniz :");
                        booksName.remove(scan.nextLine());
                        System.out.println(booksName);
                        break;
                    case 3 :
                        System.out.println("Kitaplar Sıralanıyor...");
                        Collections.sort(booksName);
                        System.out.println(booksName);
                        break;
                    case 4 :
                        System.out.println("Tüm kitaplar siliniyor...");
                        booksName.clear();
                        break;
                    case 5 :
                        System.out.println("Çıkış Yapılıyor...\nİyi Günler Dileriz");
                        isAgain = false;
                        break;
                    default:
                        System.out.println("Lütfen geçerli bir işlem giriniz...");
                        isAgain=true;
                }

            }while (isAgain);
    }
}
