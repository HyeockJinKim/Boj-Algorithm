import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] names = new String[n];
        int[] alpha = new int[26];
        for (int i = 0; i < n; ++i) {
            ++alpha[br.readLine().charAt(0)-'a'];
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; ++i) {
            if (alpha[i] > 4)
                sb.append((char)(i+'a'));
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if ("".equals(sb.toString()))
            bw.write("PREDAJA");
        else
            bw.write(sb.toString());
        bw.newLine();
        bw.close();
    }
}
