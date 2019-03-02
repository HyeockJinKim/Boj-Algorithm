import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; ++i) {
            dp[i] = i;
        }
        for (int i = 0; i < m; ++i) {
            tokenizer = new StringTokenizer(br.readLine());
            int x, y;
            x = Integer.parseInt(tokenizer.nextToken());
            y = Integer.parseInt(tokenizer.nextToken());
            if (dp[x] < dp[y]) {
                int t = x;
                x = y;
                y = t;
            }
            int t = dp[x];
            for (int j = 1; j <= n; ++j) {
                if (dp[j] == t)
                    dp[j] = dp[y];
            }
        }
        br.close();
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; ++i) {
            set.add(dp[i]);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(set.size()));
        bw.close();
    }
}
