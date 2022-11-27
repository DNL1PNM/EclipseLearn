package Eclipse;
import java.util.Scanner;
public class lesson1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int num = in.nextInt();

        if (num % 3 == 0)
            System.out.println("True");
        else
            System.out.println("False");
        in.close();
    }
}