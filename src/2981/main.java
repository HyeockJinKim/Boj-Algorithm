import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        for (int i = 0; i < n; ++i) {
            num[i] =  Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(num);
        for (int i = n-1; i > 0; --i) {
            num[i] -= num[i-1];
        }
        num[0] = 0;

        for (int i = 2; i < n; ++i) {
            num[i] = gcd(num[i], num[i-1]);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 2; i <= num[n-1]/2; ++i) {
            if (num[n-1] % i == 0) {
                bw.write(String.valueOf(i));
                bw.write(" ");
            }
        }
        bw.write(String.valueOf(num[n-1]));
        bw.close();
    }

    private static int gcd(int a, int b) {
        while (a % b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return b;
    }
}
