import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int a, b;
        a = Integer.parseInt(tokenizer.nextToken());
        b = Integer.parseInt(tokenizer.nextToken());
        br.close();
        int big = a*b, small = 1;

        for (int i = a <= b ? a : b; i >= small; --i) {
            if (a % i == 0 && b % i == 0) {
                small = i;
            }
        }
        for (int i = a >= b ? a : b; i <= big; i += small) {
            if (i % a == 0 && i % b == 0) {
                big = i;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(small));
        bw.newLine();
        bw.write(String.valueOf(big));
        bw.close();
    }
}
