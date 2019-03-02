#include <stdio.h>

int main() {
	int months[13] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int m, d;

	scanf("%d%d", &m, &d);

	for (int i = 0; i < m; ++i) {
		d += months[i];
	}
	d %= 7;
	switch(d) {
		case 0:
			printf("SUN");
			break;
		case 1:
			printf("MON");
			break;
		case 2:
			printf("TUE");
			break;
		case 3:
			printf("WED");
			break;
		case 4:
			printf("THU");
			break;
		case 5:
			printf("FRI");
			break;
		case 6:
			printf("SAT");
			break;
	}

	return 0;
}