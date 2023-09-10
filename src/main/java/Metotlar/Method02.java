package Metotlar;

public class Method02 {
    /*
    void methodlar ve return methodlar
     */
    static int power (int a ,int b ){  // int return eden bir method
        int result =1;
        for (int i = 1; i <=b  ; i++) {
            result*=a;
        }
      return result;
    }
    static void power2 (int a ,int b ){ // void returnsüz bir method arasında ki farklar
        int result =1;
        for (int i = 1; i <=b  ; i++) {
            result*=a;
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
 int r =power(2,3);
        System.out.println(r);
    }
}
