import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cow = new int[11];
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 10; ++i) {
            cow[i] = -1;
        }
        int count = 0;
        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int t1, t2;
            t1 = Integer.parseInt(tokenizer.nextToken());
            t2 = Integer.parseInt(tokenizer.nextToken());
            if (cow[t1] == -1) {
                cow[t1] = t2;
            } else {
                if (cow[t1] != t2) {
                    ++count;
                    cow[t1] = t2;
                }
            }
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.close();
    }
}
