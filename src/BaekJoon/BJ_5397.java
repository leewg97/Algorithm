package BaekJoon;

import java.io.*;
import java.util.Stack;

// 키로거
public class BJ_5397 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            Stack<Character> leftStack = new Stack<>();
            Stack<Character> rightStack = new Stack<>();
            String pwd = br.readLine();

            for (int j = 0; j < pwd.length(); j++) {
                if (pwd.charAt(j) == '<') {
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }

                } else if (pwd.charAt(j) == '>') {
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                } else if (pwd.charAt(j) == '-') {
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                } else {
                    leftStack.push(pwd.charAt(j));
                }
            }
            while (!rightStack.isEmpty()){
                leftStack.push(rightStack.pop());
            }
            for (Character character : leftStack) {
                bw.write(character);
            }
            bw.write('\n');
        }
        bw.flush();
        bw.close();
    }
}