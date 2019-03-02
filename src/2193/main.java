import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        long[][] dp = new long[n][2];
        dp[0][0] = 1;
        dp[0][1] = 1;
        for (int i = 1; i < n; ++i) {
            dp[i][0] = dp[i-1][1] + dp[i-1][0];
            dp[i][1] = dp[i-1][0];
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        if (n == 1) {
//            bw.write("1");
//        } else {
            bw.write(String.format("%d", dp[n - 1][1]));
//        }
        bw.newLine();
        bw.close();
    }
}
