import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        boolean[] dp = new boolean[7368792];
        br.close();

        int count = 0;
        for (int i = 2; i < dp.length; ++i) {
            if (!dp[i]) {
                ++count;
                if (count == k) {
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                    bw.write(String.valueOf(i));
                    bw.close();
                    return ;
                }
                for (int j = i+i; j < dp.length; j += i) {
                    dp[j] = true;
                }
            }
        }
    }
}
