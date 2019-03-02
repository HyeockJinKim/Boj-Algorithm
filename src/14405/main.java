import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        br.close();

        for (int i = 0; i < s.length; ++i) {
            if (s[i] == 'p') {
                if (++i < s.length) {
                    if (s[i] != 'i') {
                        System.out.println("NO");
                        return;
                    }
                } else {
                    System.out.println("NO");
                    return;
                }
            } else if (s[i] == 'k') {
                if (++i < s.length) {
                    if (s[i] != 'a') {
                        System.out.println("NO");
                        return;
                    }
                } else {
                    System.out.println("NO");
                    return;
                }
            } else if (s[i] == 'c') {
                if (++i < s.length) {
                    if (s[i] != 'h') {
                        System.out.println("NO");
                        return;
                    } else {
                        if (++i < s.length) {
                            if (s[i] != 'u') {
                                System.out.println("NO");
                                return;
                            }
                        } else {
                            System.out.println("NO");
                            return ;
                        }
                    }
                } else {
                    System.out.println("NO");
                    return;
                }
            } else {
                System.out.println("NO");
                return ;
            }
        }
        System.out.println("YES");
    }
}
