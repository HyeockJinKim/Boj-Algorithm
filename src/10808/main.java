import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];

        char[] word = br.readLine().toCharArray();

        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length; ++i) {
            ++alpha[word[i]-'a'];
        }

        for (int i = 0; i < alpha.length-1; ++i) {
            sb.append(alpha[i]).append(" ");
        }
        sb.append(alpha[alpha.length-1]);
        System.out.println(sb.toString());
    }
}
