package BaekJoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

// 듣보잡
public class BJ_1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                list.add(str);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

/*
 * 처음에 아무 생각 없이 ArrayList 를 사용해서 각 list 에 입력값을 넣어주고
 * 2중 for 문을 돌리며 비교했다가 4%에서 바로 시간 초과가 나왔다.
 * 문제를 다시 보니 N과 M이 각각 500,000 이하의 자연수였다.
 * 입력을 N만큼 HashSet 으로 받고 M 부터는 contain 을 이용해서 Hashset 에 값이 있는 경우에만
 * List 에 추가해서 정렬 후 출력하였다.
 */