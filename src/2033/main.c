#include <stdio.h>

int main() {
	int n, count = 1;
	scanf("%d", &n);
	
	while (10 * count < n) {
		n += 5 * count;
		count *= 10;
	}
	n /= count;
	printf("%d", n * count);
	return 0;
}