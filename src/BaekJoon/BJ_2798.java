package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 블랙잭
public class BJ_2798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr, n, m);
        System.out.println(result);
    }



    static int search(int[] arr, int n, int m) {

        int result = 0;

        // 3개를 골라야 함. 첫 번째 n-2 순회
        for(int i = 0; i < n-2; i++){

            // 두 번째 카드는 첫 카드 이후로 n-1 순회
            for(int j = i + 1; j < n-1; j++){

                // 세 번째 카드는 2번 카드 이후로 n까지 순회
                for(int k = j + 1; k < n; k++){

                    // 세개의 카드의 합
                    int temp = arr[i] + arr[j] + arr[k];

                    // 합이 M과 같으면 리턴
                    if (m == temp){
                        return temp;
                    }

                    // 이전 합 보다 크고 m 보다 작으면 result 갱신
                    if (result < temp && temp < m){
                        result = temp;
                    }
                }
            }
        }
        return result;
    }

}
