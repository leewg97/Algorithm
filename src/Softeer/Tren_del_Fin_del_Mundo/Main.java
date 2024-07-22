package Softeer.Tren_del_Fin_del_Mundo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            list.add(s);
        }

        String str = null;
        for (String s : list) {
            if (str == null) str = s;
            if (Integer.parseInt(str.split(" ")[1]) > Integer.parseInt(s.split(" ")[1])) str = s;
        }
        System.out.println(str);
    }
}
