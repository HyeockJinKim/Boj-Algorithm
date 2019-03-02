import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, k;
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        k = Integer.parseInt(tokenizer.nextToken());
        int[] coin = new int[n+1];
        for (int i = 1; i <= n; ++i) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        int[] dp = new int[k+1];
        dp[0] = 1;
        for (int j = 1; j <= n; ++j) {
            for (int i = 1; i <= k; ++i) {
                if (coin[j] <= i) {
                    dp[i] += dp[i - coin[j]];
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d", dp[k]));
        bw.newLine();
        bw.close();
    }

}
