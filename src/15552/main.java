import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < t; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int a, b;
            a = Integer.parseInt(tokenizer.nextToken());
            b = Integer.parseInt(tokenizer.nextToken());
            bw.write(String.valueOf(a+b));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
