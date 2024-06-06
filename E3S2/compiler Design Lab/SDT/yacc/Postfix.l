/*printing postfix notation*/
%{
#include<stdio.h>
#include "y.tab.h"
%}
%%
[0-9] {yylval=atoi(yytext); return NUM;}
[*+-/] {return yytext[0];}
%%
int yywrap()
{ }


/*
./a.out
Enter
8+5*2 852* +
*/
