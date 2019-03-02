#include <stdio.h>

int main() {
	int n, result=0;
	scanf("%d", &n);
	char num;
	scanf("%c", &num);
	for (int i = 0; i < n; ++i) {
		scanf("%c", &num);
		result += num-'0';
	}
	printf("%d", result);
	return 0;
}