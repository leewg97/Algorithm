package BaekJoon;

import java.io.IOException;
import java.util.Scanner;

// 오븐 시계
public class BJ_2525 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int oven = scanner.nextInt();

        scanner.close();

        // 1. 분 단위로 바꾸기
        hour = hour + oven/60;
        minute = minute + oven%60;

        if(minute > 59){
            hour++;
            minute = minute - 60;
        }

        if(hour > 23){
            hour = hour - 24;

        }

        System.out.println(hour + " " + minute);

    }

}
