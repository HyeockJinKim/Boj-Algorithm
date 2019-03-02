#include <stdio.h>
#include <malloc.h>

int main() {
	int n, t, sum=0;

	scanf("%d%d", &n, &t);

	int * task = malloc(sizeof(int)*n);
	int i;
	for (i = 0; i < n; ++i) {
		scanf("%d", task+i);
	}

	for (i = 0; i < n; ++i) {
		sum += *(task+i);
		if (sum > t)
			break;
	}

	printf("%d", i);

	return 0;
}