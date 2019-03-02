import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        double a, b, c, d;
        a = Integer.parseInt(tokenizer.nextToken());
        b = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(br.readLine());
        c = Integer.parseInt(tokenizer.nextToken());
        d = Integer.parseInt(tokenizer.nextToken());
        br.close();
        int count = 0;
        double max = a/c+b/d;
        double t = c/d+a/b;
        if (t > max) {
            max = t;
            count = 1;
        }
        t = d/b+c/a;
        if (t > max) {
            max = t;
            count = 2;
        }
        t = b/a+d/c;
        if (t > max) {
            count = 3;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.close();
    }
}
