import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] k = new int[t];
        int max = 0;
        for (int i = 0; i < t; ++i) {
            k[i] = Integer.parseInt(br.readLine());
            max = max >= k[i] ? max : k[i];
        }
        int[] dp = new int[max+1];
        br.close();
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= max; ++i) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < t; ++i) {
            bw.write(String.valueOf(dp[k[i]]));
            bw.newLine();
        }
        bw.close();
    }
}
