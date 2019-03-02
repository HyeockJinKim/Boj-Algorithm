import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        br.close();
        dp[0] = 1;
        if (n > 1) {
            dp[2] = 3;
            for (int i = 4; i <= n; i += 2) {
                dp[i] = 3 * dp[i - 2];
                for (int j = 4; j <= i; j += 2) {
                    dp[i] += 2 * dp[i - j];
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(dp[n]));
        bw.close();
    }
}
