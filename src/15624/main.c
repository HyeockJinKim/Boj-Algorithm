#include <stdio.h>
#include <stdlib.h>
#define limit 1000000007

int main() {
	int n;
	int * fibo;
	scanf("%d", &n);
	fibo = malloc(sizeof(int)*(n+1));
	*(fibo) = 0;
	*(fibo+1) = 1;
	for (int i = 2; i<=n; ++i) {
		*(fibo+i) = (*(fibo+i-1)+*(fibo+i-2))%limit;
	}	
	printf("%d", *(fibo+n));

	free(fibo);	
	return 0;
}