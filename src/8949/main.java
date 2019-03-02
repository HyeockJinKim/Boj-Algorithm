import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        char[] a, b;
        a = tokenizer.nextToken().toCharArray();
        b = tokenizer.nextToken().toCharArray();
        br.close();
        if (a.length > b.length) {
            char[] t = a;
            a = b;
            b = t;
        }
        for (int i = 0; i < b.length; ++i) {
            b[i] = (char)(b[i]-'0');
        }
        for (int i = 1; i <= a.length; ++i) {
            b[b.length-i] = (char)(a[a.length-i] + b[b.length-i]-'0');
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < b.length; ++i) {
            bw.write(String.valueOf((int)b[i]));
        }
        bw.close();
    }
}
