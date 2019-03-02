import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] result = new int[3];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            result[i] += Integer.parseInt(tokenizer.nextToken());
            result[i] += Integer.parseInt(tokenizer.nextToken());
            result[i] += Integer.parseInt(tokenizer.nextToken());
            result[i] += Integer.parseInt(tokenizer.nextToken());

            switch (result[i]) {
                case 0:
                    sb.append("D\n");
                    break;
                case 1:
                    sb.append("C\n");
                    break;
                case 2:
                    sb.append("B\n");
                    break;
                case 3:
                    sb.append("A\n");
                    break;
                case 4:
                    sb.append("E\n");
                    break;
            }
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.close();
    }
}
