#include <stdio.h>
#include <stdlib.h>

int main() {
	int c;
	scanf("%d", &c);
	int temp[1000];
	double * testCase = malloc(sizeof(double)*c);
	int n, sum, m;

	for (int i = 0; i < c; ++i) {
		scanf("%d", &n);
		sum = 0;
		for (int j = 0; j < n; ++j) {
			scanf("%d", temp+j);
			sum += *(temp+j);
		}
		sum /= n;
		m = 0;
		for (int j = 0; j < n; ++j) {
			if (sum < *(temp+j)) ++m;
		}
		*(testCase+i) = 100.0 * m / n;
	}
	for (int i = 0; i < c; ++i)
			printf("%.3lf%\n", *(testCase+i));
	free(testCase);
	return 0;
}