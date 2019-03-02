import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, l;
        n = Integer.parseInt(tokenizer.nextToken());
        l = Integer.parseInt(tokenizer.nextToken());
        int[] h = new int[n];
        tokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i)
            h[i] = Integer.parseInt(tokenizer.nextToken());
        br.close();
        Arrays.sort(h);
        for (int i = 0; i < n; ++i) {
            if (h[i] > l) {
                break;
            }
            ++l;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(l));
        bw.close();
    }
}
