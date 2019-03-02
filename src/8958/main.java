import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; ++i) {
            char[] temp = br.readLine().toCharArray();
            char prev = 'X';
            int point = 0;
            int sum = 0;
            for (int j = 0; j < temp.length; ++j) {
                prev = temp[j];
                if (prev == 'O') {
                    ++point;
                    sum += point;
                }
                else
                    point = 0;
            }
            sb.append(sum).append("\n");
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.close();
    }
}
