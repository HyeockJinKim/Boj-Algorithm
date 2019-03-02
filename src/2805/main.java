import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(br.readLine());
        int[] tree = new int[n];
        for (int i = 0; i < n; ++i) {
            tree[i] = Integer.parseInt(tokenizer.nextToken());
        }
        Arrays.sort(tree);
        int left = 0, right = tree[n-1];
        int mid;
        while (left <= right) {
            mid = (left+right)/2;
            long sum = 0;
            for (int i = 0; i < n; ++i) {
                int t = tree[i]-mid;
                if (t > 0)
                    sum += t;
            }
            if (sum >= m) {
                left = mid+1;
            } else {
                right = mid - 1;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(right));
        bw.close();
    }
}
