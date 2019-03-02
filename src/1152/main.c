#include <stdio.h>
#include <stdlib.h>

int main() {
	char * str;
	char prev;
	int num = 0;
	str = malloc(sizeof(char)*1000001);
	gets(str);
	int i;
	prev = *(str);
	for (i = 1; *(str+i)!='\0'; ++i) {
		if (prev != ' ' && *(str+i)==' ') ++num;
		prev = *(str+i);
	}
	if (prev != ' ' && prev != '\0') ++num;
	printf("%d", num);
	free(str);
	return 0;
}