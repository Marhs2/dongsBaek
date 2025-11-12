import java.util.*;
import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        BigInteger num1 = sc.nextBigInteger();
        BigInteger num2 = sc.nextBigInteger();

        BigInteger newThing = num1.gcd(num2);

        System.out.println(num1.gcd(num2));
        System.out.println(num1.multiply(num2).divide(newThing));


        sc.close();

    }
}