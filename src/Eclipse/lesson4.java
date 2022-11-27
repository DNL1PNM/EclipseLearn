package Eclipse;
import java.util.Scanner;
public class lesson4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        int num = in.nextInt();
        boolean a = 10 >=num & num >=5 ;
        System.out.println(a);
        in.close();

    }

}