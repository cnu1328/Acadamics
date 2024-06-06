/*counting no.of digits in binary number*/
%{
#include<stdio.h>
#include "y.tab.h"
%}
%%
[01] {yylval=atoi(yytext); return NUM;}
%%
int yywrap(){}

/*
./a.out
1000101

7
*/
