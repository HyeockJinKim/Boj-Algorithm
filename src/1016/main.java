import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        long min, max;
        min = Long.parseLong(tokenizer.nextToken());
        max = Long.parseLong(tokenizer.nextToken());
        br.close();
        int len = (int)(max-min);
        int sqr = (int)Math.sqrt(max)+2;
        boolean[] dp = new boolean[sqr];
        boolean[] dp2 = new boolean[len+1];

        for (long i = 2; i < sqr; ++i) {
            if (!dp[(int)i]) {
                long t = i*i;
                for (long j = t; j < sqr; j += t) {
                    dp[(int)j] = true;
                }
                long mod = min%t;
                long temp;
                if (mod != 0) {
                    temp = t-mod;
                } else {
                    temp = 0;
                }
                for (long j = temp; j <= len; j += t) {
                    dp2[(int)j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i <= len; ++i) {
            if (!dp2[i]) {
                ++count;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.close();
    }
}
