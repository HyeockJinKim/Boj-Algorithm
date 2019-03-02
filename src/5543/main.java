import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] b = new int[3];
        int[] c = new int[2];
        b[0] = Integer.parseInt(br.readLine());
        b[1] = Integer.parseInt(br.readLine());
        b[2] = Integer.parseInt(br.readLine());
        c[0] = Integer.parseInt(br.readLine());
        c[1] = Integer.parseInt(br.readLine());
        br.close();

        b[0] = b[0] <= b[1] ? b[0] : b[1];
        b[0] = b[0] <= b[2] ? b[0] : b[2];
        c[0] = c[0] <= c[1] ? c[0] : c[1];

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(b[0]+c[0]-50));
        bw.close();
    }
}
