import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int x = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n-1; ++i) {
            int t = Integer.parseInt(tokenizer.nextToken());
            if (t < x) sb.append(t).append(" ");
        }
        int t = Integer.parseInt(tokenizer.nextToken());
        if (t < x) sb.append(t);
        System.out.println(sb.toString());
    }
}
