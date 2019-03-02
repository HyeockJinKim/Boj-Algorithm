import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] g = new int[n][n];
        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j)
                g[i][j] = Integer.parseInt(tokenizer.nextToken());
        }
        br.close();
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j)
                for (int k = 0; k < n; ++k)
                    g[j][k] = g[j][i] + g[i][k] == 2 ? 1 : g[j][k];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j)
                bw.write(String.format("%d ", g[i][j]));
            bw.newLine();
        }
        bw.close();
    }
}
