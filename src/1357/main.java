import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        br.close();
        int[] x = new int[4];
        int[] y = new int[4];

        for (int i = 0; i < line[0].length(); ++i) {
            x[i] = line[0].charAt(i)-'0';
        }
        for (int i = 0; i < line[1].length(); ++i) {
            y[i] = line[1].charAt(i)-'0';
        }

        for (int i = 0; i < 3; ++i) {
            if (x[i] + y[i] > 9) {
                x[i] = x[i]+y[i]-10;
                ++x[i+1];
            } else {
                x[i] = x[i]+y[i];
            }
        }
        int result = 0, mul = 1;

        boolean isMul = false;
        for (int i = 3; i >= 0; --i) {
            if (x[i] != 0) isMul = true;
            if (isMul) {
                result += x[i] * mul;
                mul *= 10;
            }
        }
        System.out.println(result);
    }
}
