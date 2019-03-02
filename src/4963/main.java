import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int[][] map;
    private static boolean[][] check;
    private static int w, h;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            w = Integer.parseInt(tokenizer.nextToken());
            h = Integer.parseInt(tokenizer.nextToken());
            if (w == 0) {
                break;
            }
            map = new int[h][w];
            check = new boolean[h][w];
            for (int i = 0; i < h; ++i) {
                tokenizer = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; ++j) {
                    map[i][j] = Integer.parseInt(tokenizer.nextToken());
                }
            }
            int count = 0;
            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    if (map[i][j] == 1 && !check[i][j]) {
                        search(i, j);
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
        if (check[i][j] || map[i][j] == 0) {
            return ;
        }
        check[i][j] = true;
        if (i > 0) {
            if (j > 0) {
                search(i-1, j-1);
            }
            search(i-1, j);
            if (j < w-1) {
                search(i-1, j+1);
            }
        }
        if (j > 0) {
            search(i, j-1);
        }
        if (j < w-1) {
            search(i, j+1);
        }
        if (i < h-1) {
            if (j > 0) {
                search(i+1, j-1);
            }
            search(i+1, j);
            if (j < w-1) {
                search(i+1, j+1);
            }
        }
    }
}
