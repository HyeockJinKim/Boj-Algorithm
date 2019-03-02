#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	int loop, num, temp;
	int * a = malloc(sizeof(int)*5);

	scanf("%d", &loop);
	char * result = malloc(sizeof(char)*loop);
	for (int i = 0; i<loop; ++i) {
		memset(a, 0, sizeof(int) *5);
		scanf("%d", &num);
		for (int j = 0; j < num; ++j) {
			scanf("%d", &temp);
			++*(a+temp);
		}
		scanf("%d", &num);
		for (int j = 0; j < num; ++j) {
			scanf("%d", &temp);
			--*(a+temp);
		}

		if (*(a+4) > 0)
			*(result+i) = 'A';
		else if (*(a+4) < 0)
			*(result+i) = 'B';
		else if (*(a+3) > 0) 
			*(result+i) = 'A';
		else if (*(a+3) < 0)
			*(result+i) = 'B';
		else if (*(a+2) > 0)
			*(result+i) = 'A';
		else if (*(a+2) < 0)
			*(result+i) = 'B';
		else if (*(a+1) > 0)
			*(result+i) = 'A';
		else if (*(a+1) < 0)
			*(result+i) = 'B';
		else *(result+i) = 'D';
	}
	for (int i = 0; i < loop; ++i) {
		printf("%c\n", *(result+i));
	}
}