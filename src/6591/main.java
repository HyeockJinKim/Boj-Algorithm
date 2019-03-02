import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int n, k;
            n = Integer.parseInt(tokenizer.nextToken());
            k = Integer.parseInt(tokenizer.nextToken());
            if (n == 0) {
                break;
            }
            k = k <= n-k ? k : n-k;
            BigInteger result = new BigInteger("1");
            for (int i = n; i > n-k; --i) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            for (int i = 2; i <= k; ++i) {
                result = result.divide(BigInteger.valueOf(i));
            }
            bw.write(result.toString());
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
