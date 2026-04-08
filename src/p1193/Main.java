package p1193;

import java.util.Scanner;

public class Main {

    static int numerator; // 분자
    static int denominator; // 분모

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        // X가 몇 번째 대각선에 있는지 찾기
        int k = 1;
        while (true) {
            if (k*(k + 1) / 2 >= X) {
                break;
            }

            k++;
        }

        // 대각선 내 위치 계산
        int pos = X - (k - 1) * k / 2;

        // 분자 / 분모 결정
        if (k % 2 == 0) {
            numerator = pos;
            denominator = k - pos + 1;
        } else {
            numerator = k - pos + 1;
            denominator = pos;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
