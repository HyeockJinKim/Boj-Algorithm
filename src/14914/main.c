#include <stdio.h>
#include <math.h>

int main() {
	int a, b, small;

	scanf("%d%d", &a, &b);
	small = a < b ? a : b;

	for (int i = 1; i <= small; ++i) {
		if (a%i==0 && b%i==0) {
			printf("%d %d %d\n", i, a/i, b/i);
		}
	}

	return 0;
}