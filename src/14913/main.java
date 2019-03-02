import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int a, d, k;
        a = Integer.parseInt(tokenizer.nextToken());
        d = Integer.parseInt(tokenizer.nextToken());
        k = Integer.parseInt(tokenizer.nextToken());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        k -= a;
        if (k < 0 && d > 0) {
            bw.write("X");
        } else if (k > 0 && d < 0) {
            bw.write("X");
        } else if (k == 0) {
            bw.write("1");
        } else if (k % d != 0) {
            bw.write("X");
        } else {
            bw.write(String.format("%d", k/d+1));
        }
        bw.newLine();
        bw.close();
    }
}
