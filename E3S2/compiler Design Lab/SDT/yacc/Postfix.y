%{
#include<stdio.h>
void yyerror();
%}
%token NUM
%left'+' '-' 
%left '*' '/'
%% 
/*S : E {}
  | '\n' {};
E : E '+' T {printf("+");}
  | E '-' T {printf("-");}
  | T {};
T : T '*' F {printf("*");}
  | T '/' F {printf("/");}
  | F {};
F : NUM {printf("%d",$1);};*/

E1 : E '\n' {return 0;}
| E {} ;
E : E '+' T {printf("+");}
| E '-' T {printf("-");}
| T {} ;
T : T '*' F {printf("*");}
| T '/' F {printf("/");}
| F {} ;
F : NUM {printf("%d",$1);}
;
%%
void yyerror(){}
void main()
{
  printf("Enter\n");
  yyparse();
  printf("\n");
}

  
   
