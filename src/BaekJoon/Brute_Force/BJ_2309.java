package BaekJoon.Brute_Force;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 일곱 난쟁이
public class BJ_2309 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    for (int k = 2; k < arr.length; k++) {
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }
    }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<Integer> list = new ArrayList<>();
//        int sum = 0;
//
//        for (int i = 0; i < 9; i++) {
//            list.add(Integer.parseInt(br.readLine()));
//            sum += list.get(i);
//        }
//
//        for (int i = 0; i < 8; i++) {
//            for (int j = i + 1; j < 9; j++) {
//                if (sum - list.get(i) - list.get(j) == 100) {
//                    list.set(i, list.get(i) - i);
//                    list.set(j, list.get(j) - j);
//                    Collections.sort(list);
//                    for (int k = 2; k < list.size(); k++) {
//                        System.out.println(list.get(k));
//                    }
//                    return;
//                }
//            }
//        }
//    }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] height = new int[9];
//        int sum = 0;
//        for (int i = 0; i < height.length; i++) {
//            height[i] = Integer.parseInt(br.readLine());
//            sum += height[i];
//        }
//        Arrays.sort(height);
//
//        int fake1 = 0;
//        int fake2 = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                if ((sum - height[i] - height[j]) == 100) {
//                    fake1 = i;
//                    fake2 = j;
//                    break;
//                }
//            }
//        }
//
//        for (int i = 0; i < height.length; i++) {
//            if ((i == fake1) || (i == fake2)) {
//                continue;
//            }
//            System.out.println(height[i]);
//        }
//    }
}
