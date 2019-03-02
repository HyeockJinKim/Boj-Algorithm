import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int n, k;
    private static boolean[][] g;
    private static boolean[] isSearched;
    private static int[] time;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] result = new int[t];
        for (int i = 0; i < t; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            n = Integer.parseInt(tokenizer.nextToken());
            k = Integer.parseInt(tokenizer.nextToken());
            time = new int[n+1];
            isSearched = new boolean[n+1];
            g = new boolean[n+1][n+1];
            tokenizer = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; ++j) {
                time[j] = Integer.parseInt(tokenizer.nextToken());
            }
            for (int j = 0; j < k; ++j) {
                tokenizer = new StringTokenizer(br.readLine());
                int x, y;
                x = Integer.parseInt(tokenizer.nextToken());
                y = Integer.parseInt(tokenizer.nextToken());
                g[y][x] = true;
            }
            int target = Integer.parseInt(br.readLine());
            result[i] = search(target);
        }
        br.close();
        for (int i = 0; i < t; ++i) {
            System.out.println(result[i]);
        }
    }
    private static int search(int x) {
        if (isSearched[x])
            return time[x];
        int max = 0, t;
        for (int i = 1; i <= n; ++i) {
            if (g[x][i]) {
                t = search(i);
                max = max >= t ? max : t;
            }
        }
        time[x] += max;
        isSearched[x] = true;
        return time[x];
    }
}
