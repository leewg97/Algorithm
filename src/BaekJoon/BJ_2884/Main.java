package BJ_2884;

import java.io.*;
import java.util.StringTokenizer;

// 알람 시계
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int H = Integer.parseInt(st.nextToken()); // hour
        int M = Integer.parseInt(st.nextToken()); // minute

        if(M < 45){
            H--;
            M = 60 - (45 - M);

            if(H < 0){
                H = 23;
            }
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M - 45));
        }


    }
}
