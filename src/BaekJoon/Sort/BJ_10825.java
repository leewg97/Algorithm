package BaekJoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 국영수
public class BJ_10825 {

    static class Student {
        String name;
        int kor;
        int eng;
        int math;

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Student> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            list.add(new Student(name, kor, eng, math));
        }

        Collections.sort(list, (o1, o2) -> {
            if (o1.kor != o2.kor) return o2.kor - o1.kor;       // 국어 내림차순
            if (o1.eng != o2.eng) return o1.eng - o2.eng;       // 영어 오름차순
            if (o1.math != o2.math) return o2.math - o1.math;   // 수학 내림차순
            return o1.name.compareTo(o2.name);                  // 이름순 정렬
        });

        StringBuilder sb = new StringBuilder();
        for (Student student : list) {
            sb.append(student.name).append('\n');
        }
        System.out.println(sb);
    }
}

