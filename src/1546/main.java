import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int max = 0, t, sum = 0;
        for (int i = 0; i < n; ++i) {
            t = Integer.parseInt(tokenizer.nextToken());
            if (t > max) max = t;
            sum += t;
        }
        System.out.println(String.format("%.2f", sum*100.0/max/n));
    }
}
