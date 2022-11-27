package Eclipse;
import java.util.Scanner;
public class lesson5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        String num = in.nextLine();
        char c = reverseString(num).charAt(3);
        System.out.println(c);
        in.close();


    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}