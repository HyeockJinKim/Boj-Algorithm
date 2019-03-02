import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = str.length();

        for (int i = n-len*9; i < n; ++i) {
            char[] num = String.valueOf(i).toCharArray();
            int t = i;
            for (int j = 0; j < num.length; ++j) {
                t += num[j]-'0';
            }
            if (t == n) {
                bw.write(String.format("%d", i));
                bw.newLine();
                bw.close();
                return ;
            }
        }
        bw.write(String.format("%d", 0));
        bw.newLine();
        bw.close();
    }
}
