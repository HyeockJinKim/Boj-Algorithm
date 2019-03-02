#include <stdio.h>

int main() {
	char a[101];

	while(gets(a) != '\0') {
		int small = 0;
		int big = 0;
		int num = 0;
		int space = 0;
		for (int i = 0; *(a+i) != '\0'; ++i) {
			if (*(a+i) == ' ') {
				++space;
			} else if (*(a+i) < 'A') {
				++num;
			} else if (*(a+i) > 'Z') {
				++small;
			} else {
				++big;
			}
		}
		printf("%d %d %d %d\n", small, big, num, space);
	}

	return 0;
}