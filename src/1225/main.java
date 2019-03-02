import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ab = br.readLine().split(" ");
        char[] a = ab[0].toCharArray();
        char[] b = ab[1].toCharArray();

        long sumA = 0, sumB = 0;
        for (int i = 0; i < a.length; ++i) {
            sumA += a[i]-'0';
        }
        for (int i = 0; i < b.length; ++i) {
            sumB += b[i]-'0';
        }
        System.out.println(sumA * sumB);
    }
}
