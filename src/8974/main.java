import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int a, b;
        a = Integer.parseInt(tokenizer.nextToken());
        b = Integer.parseInt(tokenizer.nextToken());
        br.close();
        int[] dp = new int[b+1];
        dp[1] = 1;
        int index = 1;
        int i = 2;
        while (index < b) {
            for (int j = 0; j < i; ++j) {
                if (index == b) break;
                dp[++index] = dp[index-1]+i;
            }
            ++i;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(dp[b]-dp[a-1]));
        bw.close();
    }
}
