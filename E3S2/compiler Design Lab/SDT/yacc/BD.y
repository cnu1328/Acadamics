%{
#include<stdio.h>
void yyerror(char *s);
%}
%token num
%%
S : E {printf("Decimal=%d",$1);}
E : E L {$$=2*$1+$2;}
  | L  {$$=$1;}
L : num {$$=$1;};
%%
void yyerror(char *s){}
void main()
{
  yyparse();
 }
