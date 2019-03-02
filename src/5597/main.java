import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        int num[] = new int [30];
        Scanner s = new Scanner(System.in);
        int i,temp;
        for (i = 0 ; i < 28 ; i++) {
            temp = s.nextInt();
            num[temp-1] = 1;
        }
        for (i = 0 ; i < 30 ; i++){
            if (num[i] != 1) {
                System.out.println(i+1);

            }
        }

    }
}