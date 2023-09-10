package QuestionBooks;

public class PalindromSayilar_Method {

    static boolean isPalindrom(int input) {
        int temp, reverseNum = 0, kalan;
        temp = input;
        while (temp != 0) {
            kalan = temp % 10;
            reverseNum = reverseNum * 10 + kalan;
            temp /= 10;
        }
        if (input == reverseNum)
            return true;
        else return false;
    }

    public static void main(String[] args) {
//    123321 121
        System.out.println(isPalindrom(121));

    }
}