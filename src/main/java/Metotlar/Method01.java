package Metotlar;

public class Method01 {
    public static void main(String[] args) {
  f(2);
  f(6);
  // Bu sayede tek bir methodu istediğimiz kadar kullanabiliriz ve tekrar tekrar kod yazmamız gerekmez.
power(2,2); // üslü sayılar
    }

   static void f (int x){
        int reuslt = (x+2)*6;
        System.out.println(reuslt);
    }
    static void power (int num1 , int num2 ){
        int result = 1;
        for (int i = 1; i <=num2 ; i++) {
            result*=num1;
        }
        System.out.println("result = " + result);
    }

}
