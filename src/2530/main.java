import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, d;
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        a = Integer.parseInt(tokenizer.nextToken());
        b = Integer.parseInt(tokenizer.nextToken());
        c = Integer.parseInt(tokenizer.nextToken());
        d = Integer.parseInt(br.readLine());
        br.close();
        d %= 3600*24;
        c += d % 60;
        d /= 60;
        b += d % 60;
        d /= 60;
        a += d;
        if (c >= 60) {
            c %= 60;
            ++b;
        }
        if (b >= 60) {
            b %= 60;
            ++a;
        }
        if (a >= 24) {
            a %= 24;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(a));
        bw.write(" ");
        bw.write(String.valueOf(b));
        bw.write(" ");
        bw.write(String.valueOf(c));
        bw.close();
    }
}
