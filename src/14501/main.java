import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n+1];
        int[] p = new int[n+1];
        int[] r = new int[n+1];
        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(tokenizer.nextToken());
            p[i] = Integer.parseInt(tokenizer.nextToken());
        }
        br.close();

        for (int i = n-1; i >= 0; --i) {
            if (i + t[i] <= n) {
                r[i] += p[i]+r[i+t[i]];
            }
            r[i] = r[i] >= r[i+1] ? r[i] : r[i+1];
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(r[0]));
        bw.close();
    }
}
