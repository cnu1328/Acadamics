
%{
#include<stdio.h>
#include"y.tab.h"
%}
%%
[0-9] {yylval=atoi(yytext);return NUM;}
[+ *] {return yytext[0];}
%%
int yywrap()
{ 
}

  
  /*
   lex sdt1.l
yacc -d sdtaccept.y
gcc lex.yy.c y.tab.c
./a.out
8+5*2

./a.out
852*-
 syntax error
*/
