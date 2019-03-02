#include <stdio.h>
int main(){
	int n,i;
	double f[2];

	 f[0]=0;
	 f[1]=1;
	 scanf("%d",&n);
	 for(i=0;i<n;i++)
		f[i%2]+=f[(i+1)%2];
	 
	 printf("%.0f",f[i%2]);
}