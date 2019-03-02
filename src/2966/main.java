import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] result = br.readLine().toCharArray();
        char[][] chs = new char[3][];
        chs[0]= "ABC".toCharArray();
        chs[1] = "BABC".toCharArray();
        chs[2] = "CCAABB".toCharArray();
        br.close();
        int[] point = new int[3];
        for (int i = 0; i < n; ++i) {
            if (result[i] == chs[0][i%chs[0].length]) {
                ++point[0];
            }
            if (result[i] == chs[1][i%chs[1].length]) {
                ++point[1];
            }
            if (result[i] == chs[2][i%chs[2].length]) {
                ++point[2];
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (point[0] > point[1]) {
            if (point[0] > point[2]) {
                bw.write(String.valueOf(point[0]));
                bw.newLine();
                bw.write("Adrian");
            } else if(point[0] == point[2]) {
                bw.write(String.valueOf(point[0]));
                bw.newLine();
                bw.write("Adrian Goran");
            } else {
                bw.write(String.valueOf(point[2]));
                bw.newLine();
                bw.write("Goran");
            }
        } else if (point[0] == point[1]) {
            if (point[0] > point[2]) {
                bw.write(String.valueOf(point[0]));
                bw.newLine();
                bw.write("Adrian Bruno");
            } else if(point[0] == point[2]) {
                bw.write(String.valueOf(point[0]));
                bw.newLine();
                bw.write("Adrian Bruno Goran");
            } else {
                bw.write(String.valueOf(point[2]));
                bw.newLine();
                bw.write("Goran");
            }
        } else {
            if (point[1] > point[2]) {
                bw.write(String.valueOf(point[1]));
                bw.newLine();
                bw.write("Bruno");
            } else if (point[1] == point[2]) {
                bw.write(String.valueOf(point[1]));
                bw.newLine();
                bw.write("Bruno Goran");
            } else {
                bw.write(String.valueOf(point[2]));
                bw.newLine();
                bw.write("Goran");
            }
        }
        bw.close();
    }
}
