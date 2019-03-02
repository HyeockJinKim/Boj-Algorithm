import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; ++i) {
            int t = Integer.parseInt(tokenizer.nextToken());
            list.add(i-t-1, i);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n-1; ++i) {
            bw.write(String.valueOf(list.get(i)));
            bw.write(" ");
        }
        bw.write(String.valueOf(list.get(n-1)));
        bw.close();
    }
}
