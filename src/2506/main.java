import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int sum = 0, plus = 1;
        for (int i = 0; i < n; ++i) {
            int t = Integer.parseInt(tokenizer.nextToken());
            if (t == 1) {
                sum += plus;
                ++plus;
            } else {
                plus = 1;
            }
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.close();
    }
}
