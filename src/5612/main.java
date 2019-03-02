import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int sum = m, max = m;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int t1;
            t1 = Integer.parseInt(tokenizer.nextToken());
            t1 -= Integer.parseInt(tokenizer.nextToken());
            sum += t1;
            max = max >= sum ? max : sum;
            if (sum < 0) {
                bw.write("0");
                bw.close();
                return;
            }
        }
        br.close();

        bw.write(String.valueOf(max));
        bw.close();
    }
}
