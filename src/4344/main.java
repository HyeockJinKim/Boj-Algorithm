import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(tokenizer.nextToken());
            int[] test = new int[t];
            int avg = 0, count = 0;
            for (int j = 0; j < t; ++j) {
                test[j] = Integer.parseInt(tokenizer.nextToken());
                avg += test[j];
            }
            avg /= t;
            for (int j = 0; j < t; ++j) {
                if (test[j] > avg) ++count;
            }
            bw.write(String.format("%.3f", count*100.0/t));
            bw.write("%");
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
