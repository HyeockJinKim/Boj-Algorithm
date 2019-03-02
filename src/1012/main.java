import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static boolean[][] map, check;
    private static int m, n, k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            m = Integer.parseInt(tokenizer.nextToken());
            n = Integer.parseInt(tokenizer.nextToken());
            k = Integer.parseInt(tokenizer.nextToken());
            map = new boolean[n][m];
            check = new boolean[n][m];

            for (int j = 0; j < k; ++j) {
                tokenizer = new StringTokenizer(br.readLine());
                int x, y;
                x = Integer.parseInt(tokenizer.nextToken());
                y = Integer.parseInt(tokenizer.nextToken());
                map[y][x] = true;
            }
            int count = 0;
            for (int j = 0; j < n; ++j) {
                for (int l = 0; l < m; ++l) {
                    if (map[j][l] && !check[j][l]) {
                        search(j, l);
                        ++count;
                    }
                }
            }
            bw.write(String.valueOf(count));
            bw.newLine();
        }
        br.close();
        bw.close();
    }

    private static void search(int i, int j) {
        if (check[i][j])
            return ;
        check[i][j] = true;
        if (i > 0 && map[i-1][j]) {
            search(i-1, j);
        }
        if (i < n-1 && map[i+1][j]) {
            search(i+1, j);
        }
        if (j > 0 && map[i][j-1]) {
            search(i, j-1);
        }
        if (j < m-1 && map[i][j+1]) {
            search(i, j+1);
        }
    }
}
