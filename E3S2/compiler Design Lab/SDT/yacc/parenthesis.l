/*
CD lab internal syllabus

1. All Lex programs
2. yacc programs.calculator
3. shift reduce
4. first & follow

5. SDT codes

1)Expression evaluation(calculator)
2)syntax verification for the given grammar
3)counting no.of digits in binary number
4)printing postfix notation
5)paranthesis checker
6)conversion of binary number to decimal number
*/

%{
#include<stdio.h>
#include "y.tab.h"
%}
%%
[()\n] {return yytext[0];}
%%
int yywrap(){}

/*
Enter : ()
./a.out
Enter : (
Error
*/
