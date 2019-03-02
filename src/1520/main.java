import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int m, n;
    private static int[][] map, count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        m = Integer.parseInt(tokenizer.nextToken());
        n = Integer.parseInt(tokenizer.nextToken());
        map = new int[m+2][n+2];
        count = new int[m+2][n+2];
        for (int i = 1; i <= m; ++i) {
            tokenizer = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; ++j) {
                map[i][j] = Integer.parseInt(tokenizer.nextToken());
                count[i][j] = -1;
            }
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(dfs(1, 1)));
        bw.newLine();
        bw.close();
    }

    private static int dfs(int i, int j) {
        if (map[i][j] == 0) return 0;
        if (i == m && j == n) {
            return 1;
        }
        if (count[i][j] == -1) {
            count[i][j] = 0;
            if (map[i][j] > map[i + 1][j])
                count[i][j] += dfs(i + 1, j);
            if (map[i][j] > map[i][j + 1])
                count[i][j] += dfs(i, j + 1);
            if (map[i][j] > map[i - 1][j])
                count[i][j] += dfs(i - 1, j);
            if (map[i][j] > map[i][j - 1])
                count[i][j] += dfs(i, j - 1);
        }
        return count[i][j];
    }
}
