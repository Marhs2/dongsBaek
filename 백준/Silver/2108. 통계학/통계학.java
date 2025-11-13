import jdk.jfr.Frequency;

import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.

        Scanner sc = new Scanner(System.in);


        int size = sc.nextInt();

        int[] arr = new int[size];

        Map<Integer, Integer> map = new TreeMap<>();
        int avg = 0;
        int firstMax = 0;
        int secondMax = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < size; i++) {
            int a = sc.nextInt();
            avg += a;
            arr[i] = a;
            if (a > max) max = a;
            if (a < min) min = a;


            map.put(a, map.getOrDefault(a, 0) + 1);
        }


        int find = 0;


        ArrayList<Integer> toArr = new ArrayList<>(map.keySet());

        int colMax = Collections.max(map.values());

        ArrayList<Integer> findMax = new ArrayList<>();

        for (int i : map.keySet()) {
            if (map.get(i) == colMax) {
                findMax.add(i);
            }
        }

        Arrays.sort(arr);
        System.out.println(Math.round((float) avg / size));
        System.out.println(arr[arr.length / 2]);
        System.out.println(findMax.size() > 1 ? findMax.get(1) : findMax.get(0));
        System.out.println(max - min);

    }
}