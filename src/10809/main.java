import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        int[] alpha = new int[26];
        for (int i = 0; i < 26; ++i) {
            alpha[i] = -1;
        }
        br.close();
        for (int i = 0; i < s.length; ++i) {
            if (alpha[s[i]-'a'] == -1) {
                alpha[s[i]-'a'] = i;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 26; ++i) {
            bw.write(String.valueOf(alpha[i]));
            bw.write(" ");
        }
        bw.close();
    }
}
