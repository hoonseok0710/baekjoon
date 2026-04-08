package p4673;

public class Main {

    public static void main(String[] args) {
        boolean[] result = new boolean[10001];

        for (int n = 1; n <= 10000; n++) {
            int d = d(n);
            if (d <= 10000) {
                result[d] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!result[i]) {
                System.out.println(i);
            }
        }
    }

    private static int d(int n) {
        int sum = n;
        for (int a = n; a > 0; a /= 10) {
            sum += a % 10;
        }
        return sum;
    }
}
