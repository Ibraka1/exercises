package QuestionBooks;

import java.util.Scanner;

public class Sıralama {
    public static void main(String[] args) {
        /*
        a > b > c  veya a > c > b
        b > a > c  veya b > c > a
        c > a > b  veya c > b > a

        */
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.println("Lutfen kıyaslamak istediginiz 1. sayiyi giriniz : ");
        a = scan.nextInt();
        System.out.println("Lutfen kıyaslamak istediginiz 2. sayiyi giriniz : ");
        b = scan.nextInt();
        System.out.println("Lutfen kıyaslamak istediginiz 3. sayiyi giriniz : ");
        c = scan.nextInt();
        if (a>b && a>c ){
          if (b>c){
              System.out.println(" a > b > c ");
          }else System.out.println("a > c > b");
        } else if (b>a && b>c ) {
            if (a>c){
                System.out.println(" b > a > c");
            }else System.out.println("b > c > a");
        }else{
            if (a>b){
                System.out.println("c > a > b");
            }else System.out.println("c > b > a");
        }


    }
}
