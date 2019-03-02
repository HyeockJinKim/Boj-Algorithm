import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, b;
        n = Integer.parseInt(tokenizer.nextToken());
        b = Integer.parseInt(tokenizer.nextToken());
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = 'A'-10;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int t = n%b;
            if (t < 10)
                sb.insert(0, String.valueOf(t));
            else
                sb.insert(0, String.valueOf((char)(a+t)));
            n /= b;
        }
        bw.write(sb.toString());
        bw.close();
    }
}
