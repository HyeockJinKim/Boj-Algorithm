import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static boolean[][] map, check;
    private static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        map = new boolean[n+1][n+1];
        check = new boolean[n+1][n+1];
        for (int i = 0; i < k; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int x, y;
            x = Integer.parseInt(tokenizer.nextToken());
            y = Integer.parseInt(tokenizer.nextToken());
            map[x][y] = true;
            map[y][x] = true;
        }
        br.close();
        int sum = 0;
        for (int i = 2; i < n; ++i) {
            if (map[1][i])
                sum += search(1, i);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.close();
    }
    private static int search(int i, int j) {
        if (check[i][j])
            return 0;
        for (int k = 1; k <= n; ++k) {
            check[k][j] = true;
        }
        int sum = 1;
        for (int k = 2; k <= n; ++k) {
            if (map[j][k])
                sum += search(j, k);
        }
        return sum;
    }
}
