package p2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;
        int i = 0;

        while (i < str.length()) {
            boolean match = false;

            for (int j = 0; j < strArr.length; j++) {
                if (str.startsWith(strArr[j], i)) {
                    i += strArr[j].length();
                    count++;
                    match = true;
                    break;
                }
            }

            if (!match) {
                i++;
                count++;
            }
        }

        System.out.println(count);
    }
}
