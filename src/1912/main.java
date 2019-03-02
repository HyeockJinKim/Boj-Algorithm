import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] dp = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            a[i] = Integer.parseInt(tokenizer.nextToken());
        }
        int max = a[0];
        dp[0] = a[0];
        br.close();
        for (int i = 1; i < n; ++i) {
            dp[i] = a[i] >= dp[i-1] + a[i] ? a[i] : dp[i-1] + a[i];
            max = max >= dp[i] ? max : dp[i];
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(max));
        bw.close();
    }
}
