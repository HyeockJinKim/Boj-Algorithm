import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int roopNum;
        int[] x1 = new int[100000];
        int[] x2 = new int[100000];
        int[] y1 = new int[100000];
        int[] y2 = new int[100000];
        int[] r1 = new int[100000];
        int[] r2 = new int[100000];
        Scanner scanner = new Scanner(System.in);
        roopNum = scanner.nextInt();
        for (int i = 0; i < roopNum; ++i){
            x1[i]= scanner.nextInt();
            y1[i]= scanner.nextInt();
            r1[i]= scanner.nextInt();
            x2[i]= scanner.nextInt();
            y2[i]= scanner.nextInt();
            r2[i]= scanner.nextInt();

        }

        for (int i = 0; i < roopNum; ++i) {
            if (x1[i] == x2[i] && y1[i] == y2[i]) {
                if (r1[i] == r2[i]) {
                    System.out.println(-1);
                    continue;
                }
                else {
                    System.out.println(0);
                    continue;
                }
            }
            else {
                double tempDistance = Math.sqrt(Math.pow(x2[i]-x1[i], 2)+Math.pow(y2[i]-y1[i],2));
                int bigR= Math.max(r1[i], r2[i]), smallR = Math.min(r1[i],r2[i]);

                if (bigR > tempDistance) {
                    if (smallR + tempDistance < bigR) {
                        System.out.println(0);
                        continue;
                    }
                    else if (smallR + tempDistance == bigR) {
                        System.out.println(1);
                        continue;
                    }
                    else {
                        System.out.println(2);
                        continue;
                    }
                }
                else if (bigR == tempDistance) {
                    System.out.println(2);
                    continue;
                }
                else {
                    if (bigR + smallR < tempDistance) {
                        System.out.println(0);
                        continue;
                    }
                    else if (bigR + smallR == tempDistance) {
                        System.out.println(1);
                        continue;
                    }
                    else {
                        System.out.println(2);
                    }
                }

            }
        }

    }
}
