import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] line = br.readLine().toCharArray();
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < line.length; ++i) {
            bw.write(line[i]);
            switch (line[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    i += 2;
                    break;
                default:
                    break;
            }
        }
        bw.close();
    }
}
