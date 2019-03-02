#include <stdio.h>

int main() {
	int change, num;

	scanf("%d", &change);
	num = change / 5;
	change %= 5;
	if (num == 0) {
		if (change%2) {
			printf("%d", -1);
		} else {
			printf("%d", change/2);
		}
	} else {
		switch(change) {
			case 0:
				printf("%d", num);
				break;
			case 1:
				printf("%d", num+2);
				break;
			case 2:
				printf("%d", num+1);
				break;
			case 3:
				printf("%d", num+3);
				break;
			case 4:
				printf("%d", num+2);
				break;
		}
	}

	return 0;
}