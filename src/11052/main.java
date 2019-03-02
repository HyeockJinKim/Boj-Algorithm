import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] p = new int[n+1];
        String[] line = br.readLine().split(" ");
        for (int i = 1; i <= n; ++i) {
            p[i] = Integer.parseInt(line[i-1]);
        }
        br.close();
        for (int i = 2; i <= n; ++i) {
            int len = i/2;
            for (int j = 1; j <= len; ++j) {
                p[i] = p[i] > p[j]+p[i-j] ? p[i] : p[j]+p[i-j];
            }
        }
        System.out.println(p[n]);
    }
}
