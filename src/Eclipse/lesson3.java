package Eclipse;

import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number");
        int num = in.nextInt();
        boolean a = num % 4 == 0 & num > 10;
        System.out.println(a);
        in.close();
    }

}