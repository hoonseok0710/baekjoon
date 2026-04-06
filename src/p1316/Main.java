package p1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < N; i++) {
            int[] arr = new int[26];
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                if (arr[str.charAt(j) - 'a'] == 1 && str.charAt(j - 1) != str.charAt(j)) {
                    break;
                }
                arr[str.charAt(j) - 'a'] = 1;

                if (j == str.length() - 1) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
