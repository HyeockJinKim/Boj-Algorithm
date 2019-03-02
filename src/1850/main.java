import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        long a, b;
        a = Long.parseLong(tokenizer.nextToken());
        b = Long.parseLong(tokenizer.nextToken());
        br.close();

        while (a % b != 0) {
            long t = a;
            a = b;
            b = t % b;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < b; ++i)
            bw.write("1");
        bw.close();
    }
}
