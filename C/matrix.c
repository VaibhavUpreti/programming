#include<stdio.h>
int main(){
	int sparseMatrix[4][5]={
		{0,5,4,6,0},
		{0,0,5,7,0},
		{1,0,2,0,0},
		{0,2,6,0,0},
	};
	printf("Sparse Matrix Code - Vaibhav Upreti \n");	
	printf("\n");
	int count =0 ;
	for(int i=0; i<4; i++){
		for(int j=0; j<5;j++){
			if(sparseMatrix[i][j] != 0)
				count++;
		}
	}
	int compactMatrix[3][count];
	int k = 0;
	
	for(int i=0;i<4;i++){
		for(int j=0; j<5; j++){
			if(sparseMatrix[i][j] != 0){
				compactMatrix[0][k] = i;
				compactMatrix[1][k] = j;
				compactMatrix[2][k] = sparseMatrix[i][j];
				k++;
			}
		}
	}
	for(int i=0; i<3;i++){
		for(int j=0; j<count;j++){
			printf("%d", compactMatrix[i][j]);			
		}
		printf("\n");
	}
	return 0;
}

