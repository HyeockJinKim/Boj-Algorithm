#include <stdio.h>
#include <stdlib.h>

int main() {
	int n, num, k, grade = 1;

	scanf("%d%d", &n, &num);

	int * team = malloc(sizeof(int) * (n+1));
	int * gold = malloc(sizeof(int) * (n+1));
	int * silver = malloc(sizeof(int) * (n+1));
	int * bronze = malloc(sizeof(int) * (n+1));

	for (int i = 1; i <= n; ++i) {
		scanf("%d%d%d%d", team+i, gold+i, silver+i, bronze+i);
		if (num == *(team+i))
			k = i;
	}

	for (int i = 1; i <= n; ++i) {
		if (*(gold+i) > *(gold+k))
			++grade;
		else if (*(gold+i) == *(gold+k) && *(silver+i) > *(silver+k)) 
			++grade;
		else if (*(gold+i) == *(gold+k) && *(silver+i)==*(silver+k) && *(bronze+i) > *(bronze+k)) 
			++grade;
	}

	printf("%d", grade);

	free(team);
	free(gold);
	free(silver);
	free(bronze);
	return 0;
}