import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(tokenizer.nextToken());
        for (int i = 0; i < n-1; ++i) {
            int r = Integer.parseInt(tokenizer.nextToken());
            int t1 = s, t2 = r;
            while (t1 % t2 != 0) {
                int t = t1 % t2;
                t1 = t2;
                t2 = t;
            }
            bw.write(String.valueOf(s/t2));
            bw.write("/");
            bw.write(String.valueOf(r/t2));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
