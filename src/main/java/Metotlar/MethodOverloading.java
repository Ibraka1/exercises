package Metotlar;

public class MethodOverloading {
    static int add(int a , int b ){
        System.out.println("1.Methot");
        return a+b;

    }
    static int add(int a , int b,int c ){
        System.out.println("2.Methot");
        return a+b+c;
    }
     static double add(double a , int b, int c ){
        System.out.println("3.Methot");
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1.35,2,4));

    }
}
