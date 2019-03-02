import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] glass = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; ++i) {
            glass[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        dp[0] = glass[0];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (n == 1) {
            bw.write(String.valueOf(dp[0]));
            bw.close();
            return;
        }
        dp[1] = dp[0] + glass[1];
        if (n == 2) {
            bw.write(String.valueOf(dp[1]));
            bw.close();
            return;
        }
        dp[2] = glass[2];
        dp[2] += glass[0] > glass[1] ? glass[0]: glass[1];
        dp[2] = dp[2] >= dp[1] ? dp[2] : dp[1];
        for (int i = 3; i < n; ++i) {
            dp[i] = glass[i] + dp[i-2] >= dp[i-1] ? glass[i] + dp[i-2] : dp[i-1];
            dp[i] = dp[i] >= glass[i] + glass[i-1] + dp[i-3] ? dp[i] : glass[i] + glass[i-1] + dp[i-3];
        }
        bw.write(String.valueOf(dp[n - 1]));
        bw.close();
    }
}
