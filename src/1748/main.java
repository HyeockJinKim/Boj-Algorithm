import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int result = 0, t = 9, p = 1;
        for (int i = n/10; i > 0; i /= 10) {
            result += t * p++;
            t *= 10;
        }
        result += (n-t/9+1) * p;
        System.out.println(result);
    }
}
