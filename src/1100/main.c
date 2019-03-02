#include <stdio.h>

int main() {
	int isWhite = 1, count=0;
	char ch[8];
	for (int i = 0; i < 8; ++i) {
		scanf("%s", ch);
		for (int j = 0; j < 8; ++j) {
			if (isWhite && *(ch+j) == 'F')
				++count;
			isWhite = !isWhite;
		}
		isWhite = !isWhite;
	}

	printf("%d", count);
}