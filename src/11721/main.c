#include <stdio.h>

int main() {
	char alpha[100];
	int i = 0;
	gets(alpha);
	while (*(alpha+i) != '\0') {
		printf("%c", *(alpha+i));
		++i;
		if (i % 10 == 0) {
			printf("\n");
		}
	}
	return 0;
}
