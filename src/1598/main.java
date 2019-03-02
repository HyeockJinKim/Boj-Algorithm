import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int x1, x2, t;
        x1 = Integer.parseInt(tokenizer.nextToken());
        x2 = Integer.parseInt(tokenizer.nextToken());
        if (x1 > x2) {
            t = x1;
            x1 = x2;
            x2 = t;
        }
        int t1 = x1 % 4, t2 = x2 % 4;
        if (t1 == 0) t1 = 4;
        if (t2 == 0) t2 = 4;
        t = (x2-x1+t1-t2)/4;
        int tt = t2 > t1 ? t2-t1:t1-t2;
        System.out.println(t+tt);
    }
}
