#include<stdio.h>
#include<ctype.h>

void FIRST(char[], char);
void addToResultSet(char[], char);
int numOfProductions;
char productionSet[10][10];

void main() {
	int i;
	char choice, c, result[20];
	printf("How many number of productions ? : ");
	scanf(" %d", &numOfProductions);
	
	for(i=0; i<numOfProductions; i++) {
		printf("Enter productions Number %d : ", i+1);
		scanf(" %s", productionSet[i]);
	}
	
	do {
		printf("\n Find the FIRST of : ");
		scanf(" %c", &c);
		FIRST(result, c);
		
		printf("\n FIRST(%c) = { ", c);
		
		for(i = 0; result[i] != '\0'; i++) {
			printf(" %c ", result[i]);
		}
		
		printf("}\n");
		
		printf("Press 'y' to continue");
		scanf(" %c", &choice);
	} while(choice == 'y' || choice == 'Y');
		
}

void FIRST(char *Result, char c) {
	int i, j, k;
	char subResult[20];
	int foundEpsilon;
	
	subResult[0] = '\0';
	Result[0] = '\0';
	
	//If X is terminal, FIRST(X) = {X}.
	
	if(!(isupper(c))) {
		addToResultSet(Result, c);
		return;
	}
	
	//If X is non terminal
    	//Read each production
    	
    	for(i = 0; i<numOfProductions; i++) {
    		//Find production with X as LHS
    		
    		if(productionSet[i][0] == c) {
    			//If X → ε is a production, then add ε to FIRST(X).
    			
    			if(productionSet[i][2] == '$') addToResultSet(Result, '$');
    			
    			//If X is a non-terminal, and X → Y1 Y2 … Yk
		    	//is a production, then add a to FIRST(X)
		    	//if for some i, a is in FIRST(Yi),
		    	//and ε is in all of FIRST(Y1), …, FIRST(Yi-1).
		    	
		    	else {
		    		j = 2;
		    		
		    		while(productionSet[i][j] != '\0') {
		    			foundEpsilon = 0;
		    			
		    			FIRST(subResult, productionSet[i][j]);
		    			
		    			for(k = 0; subResult[k] != '\0'; k++) {
		    				addToResultSet(Result, subResult[k]);
		    			}
		    			
		    			for(k = 0; subResult[k] != '0'; k++) {
		    				if(subResult[k] == '$') {
		    					foundEpsilon = 1;
		    					break;
		    				}
		    			}
		    			
		    			if(!foundEpsilon) break;
		    			
		    			j++;
		    		
		    		}
		    	}
    		}
    	}
    	
    	return;
		
}


void addToResultSet(char Result[], char val) {
	int k;
	for(k = 0; Result[k] != '\0'; k++) {
		if(Result[k] == val) return;
	}
	
	Result[k] = val;
	Result[k+1] = '\0';
}



/*

How many number of productions ? :
8
Enter productions Number 1 : E=TD
Enter productions Number 2 : D=+TD
Enter productions Number 3 : D=$
Enter productions Number 4 : T=FS
Enter productions Number 5 : S=*FS
Enter productions Number 6 : S=$
Enter productions Number 7 : F=(E) 
Enter productions Number 8 : F=a

 Find the FIRST of : E

 FIRST(E) = {  (  a }
Press 'y' to continuey

 Find the FIRST of : D

 FIRST(D) = {  +  $ }
Press 'y' to continue

*/