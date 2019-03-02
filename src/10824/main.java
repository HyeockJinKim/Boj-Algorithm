import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        String a, b, c, d;
        a = tokenizer.nextToken();
        b = tokenizer.nextToken();
        c = tokenizer.nextToken();
        d = tokenizer.nextToken();
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(Long.parseLong(a+b)+Long.parseLong(c+d)));
        bw.close();
    }
}
