#include <stdio.h>
#include <stdlib.h>

int comp(const void *a, const void *b) {
	int num1 = *(int *)a;
	int num2 = *(int *)b;

	if (num1 < num2)
		return -1;
	if (num1 > num2)
		return 1;
	return 0;
}

int main() {
	int n;	
	scanf("%d", &n);

	int * a = malloc(sizeof(int) * n);

	for (int i = 0; i < n; ++i) {
		scanf("%d", a+i);
	}
	qsort(a, n, sizeof(int), comp);

	printf("%Illd",(long long int) *(a) * *(a+n-1));
	free(a);
	return 0;
}