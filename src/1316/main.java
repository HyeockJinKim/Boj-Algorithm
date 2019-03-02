import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String t = br.readLine();
            boolean[] isChecked = new boolean[26];
            char[] ct = t.toCharArray();
            char prev = '0';
            boolean isFail = false;
            for (int j = 0; j < ct.length; ++j) {
                if (prev != ct[j]) {
                    prev = ct[j];
                    if (isChecked[prev-'a']) {
                        isFail = true;
                        break;
                    }
                    isChecked[prev-'a'] = true;
                }
            }
            if (!isFail) {
                words.add(t);
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        int len = words.size();
        sb.append(len).append("\n");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.close();
    }
}
