#include <stdio.h>
#include <ctype.h>

void first(char, int, int);
int nop = 0;
char result[10], prod[10][10];

int resultIdx = 0;

int main()
{
    printf("Enter number of productions : ");
    scanf("%d", &nop);
    char ch;
    int choice;
    char c;

    printf("Enter productions : \n");

    for (int i = 0; i < nop; i++)
    {
        printf("Enter procuction %d : ", i + 1);
        scanf("%s%c", prod[i], &ch);
    }

    do
    {

        resultIdx = 0;

        printf("Find first of : ");
        scanf("%c", &c);

        first(c, 0, 0);

        printf("First(%c) : { ", c);

        for (int i = 0; i < resultIdx; i++)
        {
            printf(" %c, ", result[i]);
        }

        printf(" }\n");

        printf("press 1 to continue : ");
        scanf("%d%c", &choice, &ch);

    } while (choice == 1);
}

void first(char c, int row, int col)
{

    if (!(isupper(c)))
        result[resultIdx++] = c;

    for (int i = 0; i < nop; i++)
    {

        if (prod[i][0] == c)
        {

            if (prod[i][2] == '$')
            {
                if (prod[row][col] == '\0')
                {
                    result[resultIdx++] = '$';
                }

                else if (prod[row][col] != '\0' && (row != 0 || col != 0))
                {
                    first(prod[row][col], row, col + 1);
                }

                else
                    result[resultIdx++] = '$';
            }

            else if (islower(prod[i][2]))
                result[resultIdx++] = prod[i][2];

            else
                first(prod[i][2], i, 3);
        }
    }
}
