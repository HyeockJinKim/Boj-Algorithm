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
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 2; i >= 0; --i) {
            if (a[i] > b[i]) {
                bw.write(String.valueOf(a[2]));
                bw.write(String.valueOf(a[1]));
                bw.write(String.valueOf(a[0]));
                bw.close();
                return ;
            } else if (a[i] < b[i]) {
                bw.write(String.valueOf(b[2]));
                bw.write(String.valueOf(b[1]));
                bw.write(String.valueOf(b[0]));
                bw.close();
                return ;
            }
        }
    }
}
