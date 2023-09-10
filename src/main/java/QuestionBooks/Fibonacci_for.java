package QuestionBooks;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Fibonacii serisi 0 1 1 2 3 5 8 13 21...

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz : ");
           int input = scan.nextInt();
         int s1=0;
         int s2=1;
         int sum;
        System.out.println(input+" Sayısının Fibonacci serisi : ");
        for (int i = 1; i <=input ; i++) {
            System.out.print(s1+" , ");
            sum=s1+s2;
            s1=s2;
            s2=sum;
        }
        }

    }

