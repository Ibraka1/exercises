package MayinTarlasi;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int row,column;
        System.out.println("Mayın tarlasına hoşgeldiniz !");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz : ");
        System.out.println("Satır sayısı : ");
        row=scan.nextInt();
        System.out.println("Sütun sayısı : ");
        column=scan.nextInt();

        MayinTarlasi mayin = new MayinTarlasi(row,column);
        mayin.run();


    }
}
