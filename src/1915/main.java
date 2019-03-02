import java.io.*;
import java.util.*;

public class Main {
    private static int n, m, max;
    private static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        map = new int[n+1][m+1];
        int[][] check = new int[n+1][m+1];
        for (int i = 0; i < n; ++i) {
            char[] ch = br.readLine().toCharArray();
            for (int j = 0; j < m; ++j) {
                map[i][j] = ch[j]-'0';
            }
        }

        for (int i = n-1; i >= 0; --i) {
            for (int j = m-1; j >= 0; --j) {
                if (map[i][j] == 1) {
                    check[i][j] = checkMap(i, j, check[i+1][j+1]);
                    if (check[i][j] > max)
                        max = check[i][j];
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(max * max));
        bw.close();
    }

    private static int checkMap(int x, int y, int len) {
        int minx = len, miny = len;
        for (int i = x+1; i <= x+minx; ++i) {
            if (map[i][y] == 0) {
                minx = i - x-1;
                break;
            }
        }
        for (int j = y+1; j <= y+miny; ++j) {
            if (map[x][j] == 0) {
                miny = j - y-1;
                break;
            }
        }
        if (minx != len || miny != len){
            return Math.min(minx, miny)+1;
        }

        return len+1;
    }
}
