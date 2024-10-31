package Softeer.한양대_HCPC.X_marks_the_Spot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();
            String t = st.nextToken();

            int index = s.toUpperCase().indexOf("X");
            sb.append(t.split("")[index].toUpperCase());
        }

        System.out.print(sb);
    }
}
