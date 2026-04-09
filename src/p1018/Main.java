package p1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    static int N;
    static int M;
    static char[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = line.charAt(j);
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                result = Math.min(result, function(i, j));
            }
        }
        System.out.println(result);
    }

    static int function(int a, int b) {
        int countW = 0;
        int countB = 0;

        for (int i = a; i < a + 8; i++) {
            for (int j = b; j < b + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (graph[i][j] != 'W') countW++;
                    if (graph[i][j] != 'B') countB++;
                } else {
                    if (graph[i][j] != 'B') countW++;
                    if (graph[i][j] != 'W') countB++;
                }
            }
        }

        return Math.min(countW, countB);
    }
}
