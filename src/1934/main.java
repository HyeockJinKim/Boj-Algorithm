import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] ab = new int[t][2];
        for (int i = 0; i < t; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int t1, t2;
            t1 = Integer.parseInt(tokenizer.nextToken());
            t2 = Integer.parseInt(tokenizer.nextToken());
            if (t1 > t2) {
                ab[i][0] = t1;
                ab[i][1] = t2;
            } else {
                ab[i][1] = t1;
                ab[i][0] = t2;
            }
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < t; ++i) {
            bw.write(String.valueOf(ab[i][0] * ab[i][1] /gcd(ab[i][0], ab[i][1])));
            bw.newLine();
        }
        bw.close();
    }

    private static int gcd(int a, int b) {
        while (a % b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return b;
    }
}
