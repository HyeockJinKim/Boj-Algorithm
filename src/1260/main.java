import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static int[][] g;
    private static boolean[] isChecked;
    private static int n, m, v;
    private static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        v = Integer.parseInt(tokenizer.nextToken());
        g = new int[n+1][n+1];
        isChecked = new boolean[n+1];
        isChecked[0] = true;
        isChecked[v] = true;
        for (int i = 0; i < m; ++i) {
            tokenizer = new StringTokenizer(br.readLine());
            int t1, t2;
            t1 = Integer.parseInt(tokenizer.nextToken());
            t2 = Integer.parseInt(tokenizer.nextToken());
            g[t2][t1] = 1;
            g[t1][t2] = 1;
        }
        br.close();
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d ", v));
        dfs(v);
        isChecked = new boolean[n+1];
        isChecked[0] = true;
        isChecked[v] = true;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(v);
        bw.newLine();
        while (!list.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int index : list) {
                bw.write(String.format("%d ", index));
                for (int j = 1; j <= n; ++j) {
                    if (g[index][j] == 1 && !isChecked[j]) {
                        isChecked[j] = true;
                        temp.add(j);
                    }
                }
            }
            list = temp;
        }
        bw.close();
    }
    private static void dfs(int index) throws IOException{

        for (int i = 1; i <= n; ++i) {
            if (g[index][i] == 1 && !isChecked[i]) {
                bw.write(String.format("%d ", i));
                isChecked[i] = true;
                dfs(i);
            }
        }
    }
}
