import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, max = 0;
        for (int i = 0; i < 4; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            sum -= Integer.parseInt(tokenizer.nextToken());
            sum += Integer.parseInt(tokenizer.nextToken());
            max = max >= sum ? max : sum;
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d", max));
        bw.newLine();
        bw.close();
    }
}
