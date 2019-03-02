#include <stdio.h>

int main() {
	int n;
	scanf("%d", &n);
	if (n < 100) {
		printf("%d", n);
	} else {
		int result = 99, a,b,c;
		for (int i = 100; i <= n; ++i) {
			a = i/100;
			b = i/10%10;
			c = i%10;
			if (b-a == c-b) {
				++result;
			}
		}
		printf("%d", result);
	}
	return 0;
}