import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, a, b;
        n = Integer.parseInt(tokenizer.nextToken());
        a = Integer.parseInt(tokenizer.nextToken());
        b = Integer.parseInt(tokenizer.nextToken());
        br.close();
        int round = 0;

        while (a != b) {
            a = (a+1)/2;
            b = (b+1)/2;
            ++round;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d", round));
        bw.newLine();
        bw.close();
    }
}
