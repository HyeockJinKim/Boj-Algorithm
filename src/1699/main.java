import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; ++i) {
            dp[i] = Integer.MAX_VALUE;
        }

        int len = (int)Math.sqrt(n);
        for (int i = 1; i <= len; ++i) {
            int t = i*i;
            for (int j = t; j <= n; ++j) {
                dp[j] = dp[j] <= dp[j-t]+1 ? dp[j] : dp[j-t]+1;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(dp[n]));
        bw.close();
    }
}
