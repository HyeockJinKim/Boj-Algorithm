import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, k;
        n = Integer.parseInt(tokenizer.nextToken());
        k = Integer.parseInt(tokenizer.nextToken());
        br.close();
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 1,});
        for (int i = 2; i <= n; ++i) {
            int[] t = new int[i+1];
            t[0] = 1;
            t[i] = 1;
            for (int j = 1; j < i; ++j) {
                int[] temp = list.get(i-2);
                t[j] = (temp[j-1]+temp[j])%10007;
            }
            list.add(t);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(list.get(n-1)[k]));
        bw.close();
    }
}
