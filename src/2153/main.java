import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();
        br.close();
        int sum = 0;

        for (int i = 0; i < word.length; ++i) {
            if (word[i] >= 'a') {
                sum += word[i] - 'a'+1;
            } else {
                sum += word[i] - 'A' + 27;
            }
        }
        boolean[] g = new boolean[sum+1];
        for (int i = 1; i <= sum; ++i) {
            g[i] = true;
        }
        for (int i = 2; i <= sum; ++i) {
            if (g[i]) {
                for (int j = 2 * i; j <= sum; j += i) {
                    g[j] = false;
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (g[sum]) {
            bw.write("It is a prime word.");
        } else {
            bw.write("It is not a prime word.");
        }
        bw.close();
    }
}
