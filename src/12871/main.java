import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        char[] t = br.readLine().toCharArray();
        if (s.length < t.length) {
            char[] tmp = s;
            s = t;
            t = tmp;
        }
        char[] temp = new char[s.length*2];
        char[] temp2 = new char[s.length*2];
        int loop = temp.length/t.length;
        System.arraycopy(s, 0, temp2, 0, s.length);
        System.arraycopy(s, 0, temp2, s.length, s.length);

        for (int i = 0; i < loop; ++i) {
            System.arraycopy(t, 0, temp, i*t.length, t.length);
        }
        int index = 0;
        for (int i = t.length*loop; i < temp2.length; ++i) {
            temp[i] = t[index++];
        }
        for (int i = 0; i < temp.length; ++i) {
            if (temp[i] != temp2[i]) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
