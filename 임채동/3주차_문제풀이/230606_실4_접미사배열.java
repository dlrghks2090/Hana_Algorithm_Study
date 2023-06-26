package 알고리즘스터디3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ11656_실4_접미사배열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        sb.append(str);

        // String Builder를 이용해 앞에서 부터 짤라 나가면 될듯
        List<String> list = new ArrayList<>();
        list.add(str);
        for (int i = 0; i < str.length() - 1; i++) {
            list.add(sb.deleteCharAt(0).toString());
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
