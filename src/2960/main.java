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
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] check = new boolean[n+1];
        for (int i = 2; i <= n; ++i) {
            if (!check[i]) {
                for (int j = i; j <= n; j += i) {
                    if (!check[j]) {
                        check[j] = true;
                        --k;
                        if (k == 0) {
                            bw.write(String.valueOf(j));
                            bw.close();
                            return ;
                        }
                    }
                }
            }
        }
    }
}
