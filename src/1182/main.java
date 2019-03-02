import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int count = 0;
    private static int nums = 0;
    private static int[] num;
    private static int sum = 0;
    private static int s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        s = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(br.readLine());
        num = new int[n];
        for (int i = 0; i < n; ++i) {
            num[i] = Integer.parseInt(tokenizer.nextToken());
        }
        br.close();
        sub(0);
        System.out.println(count);
    }
    private static void sub(int index) {
        if (index >= num.length) {
            return ;
        }
        sub(index+1);
        sum += num[index];
        ++nums;

        if (sum == s && nums != 0) {
            ++count;
        }
        sub(index+1);
        sum -= num[index];
        --nums;
    }
}
