import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, k;
        n = Integer.parseInt(tokenizer.nextToken());
        k = Integer.parseInt(tokenizer.nextToken());
        br.close();

        if (n >= k) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(String.format("%d", n-k));
            bw.newLine();
            bw.close();
        } else {
            int[] step = new int[k+1];
            for (int i = 0; i <= n; ++i) {
                step[i] = n-i;
            }
            for (int i = n+1; i <= k; ++i) {
                if (i % 2 == 0) {
                    step[i] = step[i - 1] < step[i / 2] ? step[i - 1] + 1 : step[i / 2] + 1;
                }
                else {
                    step[i] = step[i - 1] < step[i / 2] + 1 ? step[i - 1] + 1 : step[i / 2] + 2;
                    step[i] = step[i] < step[(i+1) / 2] + 1 ? step[i] : step[(i+1) / 2] + 2;
                }
            }


            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(String.format("%d", step[k]));
            bw.newLine();
            bw.close();
        }

    }
}
