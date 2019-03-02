#include <stdio.h>
#include <stdlib.h>

int main() {
	int * a = malloc(sizeof(int)*10001);
	for (int i = 1; i < 10001; ++i) {
		*(a+i) = 1;
	}
	for (int i = 1; i < 10; ++i) {
		*(a+i+i) = 0;
	}
	for (int i = 10; i < 100; ++i) {
		int temp = (i/10) + (i%10) + i;
		*(a + temp) = 0;
	}
	for (int i = 100; i < 1000; ++i) {
		int temp = (i/100) + ((i/10)%10) + (i%10) + i;
		*(a + temp) = 0;
	}
	for (int i = 1000; i < 10000; ++i) {
		int temp = (i/1000) + ((i/100)%10) + ((i%100)/10) + (i%10) + i;
		if (temp < 10001)
			*(a+temp) = 0;
	}

	for (int i = 1; i < 10001; ++i) {
		if (*(a+i)==1) printf("%d\n", i);
	}

	free(a);

	return 0;
}