import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        int[][] dp = new int[n+1][n+1];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                dp[i][j] = i == j ? 0 : 5000;
            }
        }
        for (int i = 0; i < m; ++i) {
            tokenizer = new StringTokenizer(br.readLine());
            int t1, t2;
            t1 = Integer.parseInt(tokenizer.nextToken());
            t2 = Integer.parseInt(tokenizer.nextToken());
            dp[t1][t2] = 1;
            dp[t2][t1] = 1;
        }
        br.close();
        for (int k = 1; k <= n; ++k) {
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j <= n; ++j) {
                    dp[i][j] = dp[i][j] <= dp[i][k] + dp[k][j] ? dp[i][j] : dp[i][k] + dp[k][j];
                }
            }
        }
        int min = Integer.MAX_VALUE, minI = 1;
        for (int i = 1; i <= n; ++i) {
            int sum = 0;
            for (int j = 1; j <= n; ++j) {
                sum += dp[i][j];
            }
            if (min > sum) {
                minI = i;
                min = sum;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(minI));
        bw.close();
    }
}
