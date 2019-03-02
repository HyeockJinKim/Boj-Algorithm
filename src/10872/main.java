import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(fac(a));
		
	}
	
	static int fac(int n){
		if (n <=1)
			return 1;	
		return n*fac(n-1);
	}
}

