package BasicLibraryApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LibraryApp_MethodCreation {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> books = new ArrayList<>();



    public static void main(String[] args) {
        boolean isAgain =true;
        books.add("Kızıl Veba");
        books.add("Fahrenheit 451");
        books.add("Sırça Köşk ");
        books.add("Körlük");

        Scanner input = new Scanner(System.in);
        int user;
        do {
            System.out.println("--- Lütfen yapmak istediğiniz işlemi seçiniz");
            System.out.println("1 : Kitap Ekleme");
            System.out.println("2 : Kitap Silme ");
            System.out.println("3 : Kitap Sıralama");
            System.out.println("4 : Bütün Kitapları Silme");
            System.out.println("5 : Çıkış yapma ");
            user = input.nextInt();
            switch (user){
                case 1 :
                addBooks();break;
                case 2 :
                    removeBooks();break;
                case 3 :
                    list(); break;
                case 4 :
                    clearAllBooks();break;
                case 5 :
                    System.out.println("Çıkış yapılıyor... \nİyi günler dileriz. ");
                    isAgain=false;break;
                default:
                    System.out.println("Hatalı seçim yaptınız !! \nLütfen geçerli giriş yapınız :");
            }

        }while (isAgain);

    }
 public static void addBooks (){
     System.out.println("Lütfen eklemek istediğiniz kitabın ismini giriniz :");
     String adds = input.nextLine();
     books.add(adds);
     System.out.println(books);
 }
 public static void removeBooks (){
     System.out.println("Lütfen silmek istediğiniz kitabın ismini giriniz :");
     String removeBook = input.nextLine();
     books.remove(removeBook);
     System.out.println(books);
 }
 public static void list () {
     System.out.println("Kitaplar isim sırasına göre sıralanıyor ...");
     Collections.sort(books);
     System.out.println(books);
 }
 public static void clearAllBooks (){
     System.out.println("Bütün kitaplar siliniyor ...");
     books.clear();
     System.out.println(books);
 }
}
