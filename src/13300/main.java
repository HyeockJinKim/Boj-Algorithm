import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, k;
        n = Integer.parseInt(tokenizer.nextToken());
        k = Integer.parseInt(tokenizer.nextToken());
        int[][] sum = new int[2][7];
        for (int i = 0; i < n; ++i) {
            tokenizer = new StringTokenizer(br.readLine());
            int x, y;
            x = Integer.parseInt(tokenizer.nextToken());
            y = Integer.parseInt(tokenizer.nextToken());
            ++sum[x][y];
        }
        br.close();
        int room = 0;
        for (int i = 1; i <= 6; ++i) {
            if (sum[0][i] > 0)
                room += (sum[0][i]-1)/k+1;
            if (sum[1][i] > 0)
                room += (sum[1][i]-1)/k+1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(room));
        bw.close();
    }
}
