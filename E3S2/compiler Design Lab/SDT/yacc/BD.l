/*conversion of binary number to decimal number*/
%{
#include<stdio.h>
#include "y.tab.h"
%}
%%
[01] {yylval=atoi(yytext); return num;}
%%
int yywrap(){}

/*
./a.out
10

Decimal=2

./a.out
1000

Decimal=8
*/
