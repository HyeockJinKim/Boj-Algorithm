import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = 0, i = 1;
        while (n < x) {
            n += i++;
        }
        n -= --i;

        StringBuilder sb = new StringBuilder();
        if (i%2 == 0) { // even
            sb.append(x-n).append("/").append(i+1-x+n);
        } else {
            sb.append(i+1-x+n).append("/").append(x-n);
        }
        System.out.println(sb.toString());
    }
}
