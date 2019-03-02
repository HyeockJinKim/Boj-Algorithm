import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < 5; ++i) {
            int t = Integer.parseInt(tokenizer.nextToken());
            sum += t*t;
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum%10));
        bw.close();
    }
}
