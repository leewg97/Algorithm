package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 그룹 단어 체커
public class BJ_1316 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{

        int sum = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);	// i 번째 문자 저장 (현재 문자)

            if (prev != now) {   // 앞선 문자와 i 번째 문자가 같지 않다면?

                if ( check[now - 'a'] == false ) { // 해당 문자가 처음 나오는 경우 (false 인 경우)
                    check[now - 'a'] = true;
                    prev = now;
                }

                else {  // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
                    return false;	//함수 종료
                }
            }
        }
        return true;
    }
}
