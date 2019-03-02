import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int[] a = new int[4];
        a[0] = Integer.parseInt(tokenizer.nextToken());
        a[1] = Integer.parseInt(tokenizer.nextToken());
        a[2] = Integer.parseInt(tokenizer.nextToken());
        a[3] = Integer.parseInt(tokenizer.nextToken());
        br.close();
        Arrays.sort(a);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(a[0]*a[2]));
        bw.close();
    }
}
