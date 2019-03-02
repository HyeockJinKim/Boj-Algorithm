import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int s1, s2, s3;
        s1 = Integer.parseInt(tokenizer.nextToken());
        s2 = Integer.parseInt(tokenizer.nextToken());
        s3 = Integer.parseInt(tokenizer.nextToken());
        br.close();
        int[] dp = new int[s1+s2+s3+1];
        for (int i = 1; i <= s1; ++i) {
            for (int j = 1; j <= s2; ++j) {
                for (int k = 1; k <= s3; ++k) {
                    ++dp[i+j+k];
                }
            }
        }
        int max = 0, maxLength = 0;
        for (int i = 1; i <= s1+s2+s3; ++i) {
            if (max < dp[i]) {
                max = dp[i];
                maxLength = i;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(maxLength));
        bw.close();
    }
}
