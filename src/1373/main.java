import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] bin = br.readLine().toCharArray();
        br.close();
        StringBuilder sb = new StringBuilder();
        int mod = bin.length % 3;
        if (mod == 1) {
            sb.append(String.valueOf(bin[0] -'0'));
        } else if (mod == 2) {
            sb.append(String.valueOf((bin[0]-'0')*2 + bin[1]-'0'));
        }
        for (int i = mod; i < bin.length; i += 3) {
            int sum = 0;
            for (int j = 0; j < 3; ++j) {
                if (j == 0 && bin[i+j] == '1')
                    sum += 4;
                else if (j == 1 && bin[i+j] == '1')
                    sum += 2;
                else if (j == 2 && bin[i+j] == '1')
                    sum += 1;
            }
            sb.append(String.valueOf(sum));
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.newLine();
        bw.close();
    }
}
