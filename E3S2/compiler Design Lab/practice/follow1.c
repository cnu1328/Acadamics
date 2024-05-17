#include <stdio.h>
#include <string.h>
#include <ctype.h>

int nop = 0, resultIndex = 0;
char prod[10][10], result[10];

void first(char);
void follow(char);
void addResult(char);

int main()
{
    printf("Enter number of Productions : ");
    scanf(" %d", &nop);

    printf("Enter Productions : ");
    for (int i = 0; i < nop; i++)
    {
        printf("production %d : ", i + 1);
        scanf(" %s", prod[i]);
    }

    char choice, c;

    do
    {
        int resultIndex = 0;

        printf("Find Follow of : ");
        scanf(" %c", &c);
        follow(c);

        printf("Follow(%c) : { ", c);

        for (int i = 0; i < resultIndex; i++)
        {
            printf(" %c, ", result[i]);
        }

        printf(" }\n");

        printf("Press y or Y to continue");

        scanf(" %c", &choice);

    } while (choice == 'y' || choice == 'Y');
}

void follow(char c)
{

    if (prod[0][0] == c)
        addResult('$');

    for (int i = 0; i < nop; i++)
    {
        for (int j = 2; j < strlen(prod[i]); j++)
        {

            if (prod[i][j] == c)
            {

                if (prod[i][j + 1] != '\0')
                {
                    first(prod[i][j + 1]);
                }

                else if (prod[i][j + 1] == '\0' && prod[i][0] != c)
                    follow(prod[i][0]);
            }
        }
    }
}

void first(char c)
{

    if (!(isupper(c)))
        addResult(c);

    for (int i = 0; i < nop; i++)
    {
        if (prod[i][0] == c)
        {

            if (prod[i][2] == '$')
            {
                follow(prod[i][0]);
            }

            else if (islower(prod[i][2]))
            {
                addResult(prod[i][2]);
            }

            else
                first(prod[i][2]);
        }
    }
}

void addResult(char c)
{
    int k;

    for (k = 0; k <= resultIndex; k++)
    {
        if (result[k] == c)
            return;
    }

    result[resultIndex++] = c;
}