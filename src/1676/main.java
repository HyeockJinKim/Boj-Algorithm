import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int[] two = new int[n+1];
        int[] five = new int[n+1];
        for (int i = 1; i <= n; ++i) {
            int t = i;
            two[i] += two[i-1];
            five[i] += five[i-1];
            while (t % 2 == 0) {
                t /= 2;
                ++two[i];
            }
            t = i;
            while (t % 5 == 0) {
                t /= 5;
                ++five[i];
            }
        }
        System.out.println(two[n] > five[n] ? five[n] : two[n]);
    }
}
