import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long[] c = new long[t];
        for (int i = 0; i < t; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int n, m;
            n = Integer.parseInt(tokenizer.nextToken());
            m = Integer.parseInt(tokenizer.nextToken());
            if (m == n) {
                c[i] = 1;
                continue;
            }
            n = n <= m-n ? n : m-n;
            long temp1 = m;
            long temp2 = n;
            for (int j = 1; j < n; ++j) {
                temp1 *= m-j;
                temp2 *= j;
            }
            c[i] = temp1 / temp2;
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; ++i) {
            sb.append(c[i]).append("\n");
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.close();
    }
}
