#include <stdio.h>


int main() {
        int input;
        int prev;
        int count = 1;
        int ten;
        int one;
        scanf("%d", &input);
        prev = input;
        ten = input / 10;
        one = input % 10;
        while ((input=one*10 + (ten+one)%10)!=prev) {
                ten = input / 10;
                one = input % 10;
                ++count;
        }
        printf("%d", count);

        return 0;
}
