package Work01;

import java.util.ArrayList;
import java.util.List;

public class ListSayıKaresi {
     /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
     public static void main(String[] args) {
         List<Integer> nums = new ArrayList<>();
         nums.add(12);
         nums.add(5);
         nums.add(7);
         nums.add(3);

         int square = 0;

         for (int a :nums) {
         square += a*a;
         }
         System.out.println("square = " + square);




     }
}
