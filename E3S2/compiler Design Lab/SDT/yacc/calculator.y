%{
#include<stdio.h>
void yyerorr(char *c);
%}
%token NUM
%left '+' '-'
%left '*' '/'
%%
S : E {printf("%d",$$);}
E : E '+' E {$$=$1+$3;}
E : E '*' E {$$=$1*$3;}
E : NUM {$$=$1;};
%%
void main()
{
  printf("Enter String");
  yyparse();
  }
 void yyerror(char *c)
 {
 }
 
 /*
 lex ex.l
yacc -d ex.y
gcc lex.yy.c y.tab.c 
 ./a.out
Enter String

6*2

12

