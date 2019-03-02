import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            int t = Integer.parseInt(tokenizer.nextToken());
            min = min <= t ? min : t;
            max = max >= t ? max : t;
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(min));
        bw.write(" ");
        bw.write(String.valueOf(max));
        bw.close();
    }
}
