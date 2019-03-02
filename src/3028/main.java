import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] result = new boolean[3];
        result[0] = true;
        char[] line = br.readLine().toCharArray();
        br.close();
        for (int i = 0; i < line.length; ++i) {
            if (line[i] == 'A') {
                if (result[0]) {
                    result[0] = false;
                    result[1] = true;
                } else if (result[1]){
                    result[1] = false;
                    result[0] = true;
                }
            } else if (line[i] == 'B') {
                if (result[2]) {
                    result[2] = false;
                    result[1] = true;
                } else if (result[1]){
                    result[1] = false;
                    result[2] = true;
                }
            } else {
                if (result[0]) {
                    result[0] = false;
                    result[2] = true;
                } else if (result[2]){
                    result[2] = false;
                    result[0] = true;
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (result[0]) {
            bw.write("1");
        } else if (result[1]) {
            bw.write("2");
        } else {
            bw.write("3");
        }
        bw.close();
    }
}
