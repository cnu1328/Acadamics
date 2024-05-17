%{
#include<stdio.h>
void yyerror(char *s);
int c=0;
%}

%token NUM

%%
S : E {$$=c;printf("%d",$$);}
E : E L {$$=c;}
  | L {$$=c;}
L : NUM {$$=++c;};
%%

void main()
{
 yyparse();
}

void yyerror(char *s)
{
}

//$$ - resultant
