import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int[][] card;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        card = new int[n+1][5];

        for (int i = 1; i <= n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            card[i][0] = Integer.parseInt(tokenizer.nextToken());
            card[i][1] = Integer.parseInt(tokenizer.nextToken());
            card[i][2] = Integer.parseInt(tokenizer.nextToken());
            card[i][3] = Integer.parseInt(tokenizer.nextToken());
            card[i][4] = Integer.parseInt(tokenizer.nextToken());
        }
        int max = 0, maxIndex = 0;
        for (int i = 1; i <= n; ++i) {
            int t = comb(i, 1, 0, 3);
            if (max <= t) {
                max = t;
                maxIndex = i;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d", maxIndex));
        bw.newLine();
        bw.close();
    }

    private static int comb(int i, int j, int sum, int size) {
        if (size == 0) {
            return sum % 10;
        }
        if (j > 4)
            return -1;
        int max = 0;
        int t = comb(i, j+1, sum, size) % 10;
        max = max >= t ? max : t;
        t = comb(i, j+1, sum+card[i][j], size-1);
        max = max >= t ? max : t;
        return max;
    }
}
