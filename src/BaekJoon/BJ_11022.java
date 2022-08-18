package BaekJoon;

import java.io.IOException;
import java.util.Scanner;

public class BJ_11022 {

    public static void main(String[] args) throws IOException {
        // Scanner 사용
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int A;
        int B;

        for(int i = 1; i <= T; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
        }
        sc.close();
    }

/*        // BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int A;
        int B;

        StringTokenizer st;

        for(int i = 1; i <= T; i++){
            st = new StringTokenizer(br.readLine(), " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
        }
        br.close();
    }*/
}
