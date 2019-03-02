import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m;
        n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            a[i] = Integer.parseInt(tokenizer.nextToken());
        }
        Arrays.sort(a);

        m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        tokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; ++i) {
            int t = Integer.parseInt(tokenizer.nextToken());
            int index = Arrays.binarySearch(a, t);
            index = index >= 0 ? 1 : 0;
            sb.append(index).append("\n");
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.close();
    }
}
