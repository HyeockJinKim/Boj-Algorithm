import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, r, c;
        n = Integer.parseInt(tokenizer.nextToken());
        r = Integer.parseInt(tokenizer.nextToken());
        c = Integer.parseInt(tokenizer.nextToken());
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(recursive((int) Math.pow(2, n), r, c)));
        bw.close();
    }

    private static int recursive(int n, int x, int y) {
        if (n == 1) {
            return 0;
        }
        int m = n/2;
        if (x < m) {
            if (y < m) {
                return recursive(m, x%m, y%m);
            } else {
                return m*m + recursive(m, x%m, y%m);
            }
        } else {
            if (y < m) {
                return m*n + recursive(m, x%m, y%m);
            } else {
                return m*m+m*n + recursive(m, x%m, y%m);
            }
        }
    }
}
