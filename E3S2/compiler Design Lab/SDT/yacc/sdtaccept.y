%{
#include<stdio.h>
int f=0;
%}
%token NUM '+' '*'
%left '+' '-'
%left '*' 
%%
S : E '\n' 
| E {};
E : E '+' T {}
E : E '-' T {}
E :T{}
T : T '*' F{}
T  : F {}
F : NUM { }
;
%%
void main()
{
yyparse();
if(f==0)
   printf("Valid");
}
void yyerror(char *s) {
    f=1;
    fprintf(stderr, " %s\n",  s);
}

