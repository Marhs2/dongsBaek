import java.util.*;
import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String b = sc.nextLine();

        int aCount = a.length() - 1;

        int bCount = b.length() - 1;

        if (aCount >= bCount) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

    }

}