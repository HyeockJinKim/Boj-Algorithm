import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, k;
        n = Integer.parseInt(tokenizer.nextToken());
        k = Integer.parseInt(tokenizer.nextToken());
        int[] coin = new int[n];
        int[] dp = new int[k+1];
        for (int i = 0; i < n; ++i) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(coin);
        for (int i = 1; i <= k; ++i) {
            dp[i] = 10000000;
        }
        for (int i = n-1; i >= 0; --i) {
            for (int j = coin[i]; j <= k; ++j) {
                dp[j] = dp[j] <= dp[j-coin[i]] + 1 ? dp[j] : dp[j-coin[i]] + 1;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (dp[k] < 10000000)
            bw.write(String.valueOf(dp[k]));
        else
            bw.write("-1");
        bw.close();
    }
}
