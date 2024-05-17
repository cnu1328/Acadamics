#include<stdio.h>
#include<stdlib.h>

int main(){
    int n,m;
    printf("Enter row and column of a matrix to check relation : ");
    scanf("%d%d",&n,&m);
    if(n==m){
    	int a[n][m];
    	printf("Enter values in cloumn wise : ");
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
                scanf("%d",&a[i][j]);
                if(a[i][j]!=0 && a[i][j]!=1){
                    printf("Please Enter 0 or 1 : ");
                    scanf("%d",&a[i][j]);
                }
    		}
   	 }

        printf("Entered square matrix is : \n");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                printf("%d ",a[i][j]);
            printf("\n");

        }

        printf("Is Entered Matrix is Reflexive or Not? : ");
        int flag = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[j][j]!=1){
                    flag = 0;
                    break;
                }
                    
            }
        }
         if(flag == 1)
            printf("Reflexive\n");
        else
            printf("Not Reflexive\n");

        printf("\nIs Entered Matrix is Symmeteric or Not? : ");
        flag = 1;
        for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                if(a[i][j]!=a[j][i]){
                    flag = 0;
                    break;
                }
            }
        }
        if(flag == 1)
            printf("Symmetric\n");
        else
            printf("Not Symmetric\n");
        //An asymmetric matrix is a square matrix that is not symmetric, i.e., a matrix A such that A^(T)!=A,

        printf("\nIs Entered Matrix is Asymmetric or NOt? : ");
        flag =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==a[j][i]){
                    flag = 0;
                    break;
                }
            }
        }
        if(flag==1)
            printf("Asymmetric");
        else
            printf("Not Asymmetric");

        //A special class of asymmetric matrix satisfying a_(ij)=-a_(ji) is known as an antisymmetric matrix.
        printf("\nIs Entered Matrix is Anti-Symmetric or Not? : ");
        flag = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && a[i][j]==a[j][i]){
                    flag = 0;
                    break;
                }
            }
        }
        if(flag == 1)
            printf("Anti-Symmetric\n");
        else
            printf("Not Anti-Symmetric\n");

        printf("\nIs Entered Matrix is Transitive or Not? : ");
        flag = 1;

        int b[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=0;
                for(int k=0;k<n;k++){
                    b[i][j] += a[i][k]*a[k][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=(a[i][j]+b[i][j])){
                    flag =0;
                    break;
                }
            }
        }


        if(flag == 1)
            printf("Transitive\n");
        else
            printf("Not Transitive\n");





   }
    else{
    	printf("To check relations of matrix, the row and column should be same i.e, matrix should be square matrix");

    }



}
