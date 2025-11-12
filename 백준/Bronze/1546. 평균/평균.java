import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int count = sc.nextInt();

        int[] arr = new int[count];

        float avg = 0;
        int max = 0;


        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            if (max < a) {
                max = a;
            }
        }
        ;

        for (int i : arr) {
            avg += (((float) i / max) * 100);
        }
        System.out.println((float) avg / count);


        sc.close();

    }
}