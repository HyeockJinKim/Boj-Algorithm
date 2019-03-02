import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, k;
        n = Integer.parseInt(tokenizer.nextToken());
        k = Integer.parseInt(tokenizer.nextToken());
        int[] c = new int[n];
        for (int i = 0; i < n; ++i) {
            c[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        int count = 0;
        for (int i = n-1; i >= 0; --i) {
            if (k == 0) {
                break;
            }
            count += k / c[i];
            k %= c[i];
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.close();
    }
}
