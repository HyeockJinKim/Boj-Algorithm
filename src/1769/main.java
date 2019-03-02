import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        int n, count = 0;

        if (str.length() > 1) {
            String[] num = str.split("");
            n = 0;
            for (int i = 0; i < num.length; ++i) {
                n += Integer.parseInt(num[i]);
            }
            ++count;
        } else {
            n = Integer.parseInt(str);
        }

        while (n >= 10) {
            int temp = 0;
            while (n!= 0) {
                temp += n % 10;
                n /= 10;
            }
            n = temp;
            ++count;
        }
        System.out.println(count);
        if (n == 3 || n == 6 || n == 9) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
