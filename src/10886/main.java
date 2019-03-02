import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int mid = n/2;
        for (int i = 0; i < n; ++i) {
            if (Integer.parseInt(br.readLine()) == 0) {
                --mid;
            }
        }
        br.close();

        if (mid < 0) {
            System.out.println("Junhee is not cute!");
        } else {
            System.out.println("Junhee is cute!");
        }
    }
}
