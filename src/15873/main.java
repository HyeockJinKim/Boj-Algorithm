import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ab = br.readLine().toCharArray();
        br.close();
        if (ab.length > 2) {
            if (ab[1] =='0') {
                if (ab.length == 4) {
                    System.out.println(20);
                } else {
                    System.out.println("1"+ab[2]);
                }
            } else {
                System.out.println("1"+ab[0]);
            }
        } else {
            System.out.println(ab[0]+ab[1]-'0'-'0');
        }
    }
}
