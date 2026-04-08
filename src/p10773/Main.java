package p10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            int j = Integer.parseInt(br.readLine());

            if (j == 0) {
                list.remove(list.size() - 1);
            } else {
                list.add(j);
            }
        }

        for (Integer i : list) {
            result += i;
        }

        System.out.println(result);
    }
}
