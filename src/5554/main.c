#include <stdio.h>

int main() {
	int sum = 0, input;
	for (int i = 0; i < 4; ++i) {
		scanf("%d", &input);
		sum += input;
	}
	printf("%d\n%d",sum/60, sum%60);
	return 0;
}