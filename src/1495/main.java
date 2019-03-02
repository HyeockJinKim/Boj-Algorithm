import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    private static int[] v;
    private static int n, s, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        s = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        v = new int[n];
        tokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            v[i] = Integer.parseInt(tokenizer.nextToken());
        }
        br.close();
        TreeSet<Integer> guitar = new TreeSet<>();
        guitar.add(s);
        for (int i = 0; i < n; ++i) {
            TreeSet<Integer> temp = new TreeSet<>();
            if (!guitar.isEmpty())
                for (int t : guitar) {
                    if (t+v[i] <= m)
                        temp.add(t+v[i]);
                    if (t-v[i] >= 0)
                        temp.add(t-v[i]);
                    guitar = temp;
                }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (guitar.isEmpty())
            bw.write("-1");
        else
            bw.write(String.format("%d", guitar.last()));
        bw.newLine();
        bw.close();
    }

}
