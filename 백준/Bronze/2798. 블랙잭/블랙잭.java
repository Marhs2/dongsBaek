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
        int size = sc.nextInt();

        int[] arr = new int[count];

        for (int i = 0; i < count; i++) arr[i] = sc.nextInt();


        int sum = 0;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                for (int k = j + 1; k < count; k++) {
                    int num = arr[i] + arr[j] + arr[k];
                    if (num <= size) {
                        if (num > sum) sum = num;

                    }
                }
            }


        }

        System.out.println(sum);

        sc.close();

    }
}