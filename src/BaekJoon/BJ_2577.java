package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자의 개수
public class BJ_2577 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int ABC = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        String str = String.valueOf(ABC);

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - '0')]++;
        }

        for (int value : arr) {
            System.out.println(value);
        }


//        int ABC = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
//        String str = Integer.toString(ABC);
//
//        for (int i = 0; i < str.length(); i++) {
//            int count = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if ((str.charAt(j) - '0') == i) {
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }

    }
}
