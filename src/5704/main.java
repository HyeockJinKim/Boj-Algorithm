import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] line = br.readLine().toCharArray();
        while (line[0] != '*') {
            boolean[] isAlpha = new boolean[26];
            for (int i = 0; i < line.length; ++i) {
                if (line[i] == ' ')
                    continue;
                isAlpha[line[i]-'a'] = true;
            }
            boolean isCheck = true;
            for (int i = 0; i < isAlpha.length; ++i) {
                if (!isAlpha[i]) {
                    isCheck = false;
                }
            }
            if (isCheck) {
                bw.write("Y");
            } else {
                bw.write("N");
            }
            bw.newLine();
            line = br.readLine().toCharArray();
        }
        br.close();
        bw.close();
    }
}
