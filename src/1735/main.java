import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int a1, a2, b1, b2;
        a1 = Integer.parseInt(tokenizer.nextToken());
        a2 = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(br.readLine());
        b1 = Integer.parseInt(tokenizer.nextToken());
        b2 = Integer.parseInt(tokenizer.nextToken());
        br.close();
        a1 = a1 * b2 + a2 * b1;
        a2 *= b2;
        int min = a2 <= b2 ? a2 : b2;
        for (int i = min; i > 1; --i) {
            if (a2 % i == 0 && a1 % i == 0) {
                a2 /= i;
                a1 /= i;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d %d", a1, a2));
        bw.close();
    }
}
