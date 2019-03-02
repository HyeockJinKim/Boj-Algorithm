import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        long n, m;
        n = Long.parseLong(tokenizer.nextToken());
        m = Long.parseLong(tokenizer.nextToken());
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(n==m ? "1" : "0");
        bw.close();
    }
}
