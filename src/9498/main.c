#include <stdio.h>

int main() {
	int num;
	scanf("%d", &num);
	
	switch(num/10) {
		case 10:
		case 9:
			printf("A");
			break;
		case 8:
			printf("B");
			break;
		case 7:
			printf("C");
			break;
		case 6:
			printf("D");
			break;
		default:
			printf("F");
	}

	return 0;
}