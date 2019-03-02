import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), "-");
            char[] alpha = tokenizer.nextToken().toCharArray();
            int t1 = (alpha[0]-'A') * 26*26 + (alpha[1]-'A')*26 + (alpha[2]-'A');
            int t2 = Integer.parseInt(tokenizer.nextToken());
            if (t1-t2 >= -100 && t1-t2 <= 100) {
                bw.write("nice");
            } else {
                bw.write("not nice");
            }
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
