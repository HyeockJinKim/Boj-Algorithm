import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int[][] dp;
    private static int[][] map;
    private static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        map = new int[n+2][m+2];
        for (int i = 1; i <= n; ++i) {
            char[] line = br.readLine().toCharArray();
            for (int j = 1; j <= m; ++j) {
                map[i][j] = line[j-1]-'0';
            }
        }
        br.close();
        dp = new int[n+2][m+2];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                dp[i][j] = 100000;
            }
        }
        dp[1][1] = 1;
        search(1, 1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d", dp[n][m]));
        bw.newLine();
        bw.close();
    }

    private static void search(int i, int j) {
        if (i==n && j ==m)
            return ;
        if (map[i+1][j] == 1 && dp[i][j]+1 < dp[i+1][j]) {
            dp[i+1][j] = dp[i][j] + 1;
            search(i+1, j);
        }
        if (map[i-1][j] == 1 && dp[i][j]+1 < dp[i-1][j]) {
            dp[i-1][j] = dp[i][j] + 1;
            search(i-1, j);
        }
        if (map[i][j+1] == 1 && dp[i][j]+1 < dp[i][j+1]) {
            dp[i][j+1] = dp[i][j] + 1;
            search(i, j+1);
        }
        if (map[i][j-1] == 1 && dp[i][j]+1 < dp[i][j-1]) {
            dp[i][j-1] = dp[i][j] + 1;
            search(i, j-1);
        }
    }
}
