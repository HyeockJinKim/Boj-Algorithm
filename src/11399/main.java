import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] p = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            p[i] = Integer.parseInt(tokenizer.nextToken());
        }
        Arrays.sort(p);
        br.close();
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += (n-i)* p[i];
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.close();
    }
}
