import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static char[][] map;
    private static int r, c;
    private static boolean[][] isCheck;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        r = Integer.parseInt(tokenizer.nextToken());
        c = Integer.parseInt(tokenizer.nextToken());
        map = new char[r][];
        for (int i = 0; i < r; ++i)
            map[i] = br.readLine().toCharArray();
        br.close();
        int[] result = new int[2];
        int[] t;
        isCheck = new boolean[r][c];
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                if (map[i][j] != '#' && !isCheck[i][j]) {
                    t = dfs(i, j);
                    if (t[0] < t[1]) {
                        result[1] += t[1];
                    } else {
                        result[0] += t[0];
                    }
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result[1]));
        bw.write(" ");
        bw.write(String.valueOf(result[0]));
        bw.close();
    }

    private static int[] dfs(int i, int j) {
        int[] result = new int[2];
        if (isCheck[i][j])
            return result;
        isCheck[i][j] = true;
        if (map[i][j] == 'v') {
            ++result[0];
        } else if (map[i][j] == 'k') {
            ++result[1];
        }
        int[] t;
        if (i > 0 && map[i-1][j] != '#') {
            t = dfs(i-1, j);
            result[0] += t[0];
            result[1] += t[1];
        }
        if (j > 0  && map[i][j-1] != '#') {
            t = dfs(i, j-1);
            result[0] += t[0];
            result[1] += t[1];
        }
        if (i < r-1 && map[i+1][j] != '#') {
            t = dfs(i+1, j);
            result[0] += t[0];
            result[1] += t[1];
        }
        if (j < c-1 && map[i][j+1] != '#') {
            t = dfs(i, j+1);
            result[0] += t[0];
            result[1] += t[1];
        }
        return result;
    }
}
