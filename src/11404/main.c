#include <stdio.h>
#include <malloc.h>

int main() { 
	int n, m;

	scanf("%d", &n);
	scanf("%d", &m);
	++n;
	int * g = malloc(sizeof(int)*n*n);

	for (int i = 1; i < n; ++i) {
		for (int j = 1; j < n; ++j) {
			*(g+i*n+j) = 100001;
		}
	}
	for (int i = 0; i < m; ++i) {
		int t1, t2, t3;
		scanf("%d%d%d", &t1, &t2, &t3);
		*(g+t1*n+t2) = *(g+t1*n+t2) > t3 ? t3 : *(g+t1*n+t2);
	}
	for (int i = 1; i < n; ++i) {
		for (int j = 1; j < n; ++j) {
			for (int k = 1; k < n; ++k) {
				*(g+j*n+k) = *(g+j*n+k) > *(g+j*n+i)+*(g+i*n+k) ? *(g+j*n+i)+*(g+i*n+k) : *(g+j*n+k);
			}
		}
	}

	for (int i = 1; i < n; ++i) {
		for (int j = 1; j < n; ++j) {
			if (i == j) printf("0 ");
			else
			printf("%d ", *(g+i*n+j) > 100000 ? 0: *(g+i*n+j));
		}
		printf("\n");
	}
	
	free(g);
	return 0;
}