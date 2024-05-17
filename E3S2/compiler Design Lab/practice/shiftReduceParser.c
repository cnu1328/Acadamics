#include <stdio.h>
#include <string.h>

struct productionRule
{
    char left[10];
    char right[10];
};

int main()
{
    char input[20], stack[50], temp[50], ch[2], *token1, *token2, *subString;

    int ruleCount = 0;
    struct productionRule rules[10];

    stack[0] = '\0';

    printf("Enter the No.of production Rules: ");
    scanf("%d", &ruleCount);

    printf("Enter the Production Rules : ");

    for (int i = 0; i < ruleCount; i++)
    {
        printf("Production Rule %d : ", i + 1);
        scanf("%s", temp);

        token1 = strtok(temp, "->");
        token2 = strtok(NULL, "->");

        strcpy(rules[i].left, token1);
        strcpy(rules[i].right, token2);
    }

    printf("\nEnter the input String : ");
    scanf("%s", input);

    int i = 0;

    printf("Stack \t Input \t Action \n");

    while (1)
    {
        if (i < strlen(input))
        {
            ch[0] = input[i];
            ch[1] = '\0';
            i++;

            strcat(stack, ch);

            printf("$%s\t", stack);

            for (int k = i; k < strlen(input); k++)
            {
                printf("%c", input[k]);
            }

            printf("$\t Shift -> %s\n", ch);
        }

        for (int j = 0; j < ruleCount; j++)
        {
            subString = strstr(stack, rules[j].right);

            if (subString != NULL)
            {
                int stackLength = strlen(stack);
                int subLen = strlen(subString);

                int stackTop = stackLength - subLen;

                stack[stackTop] = '\0';

                strcat(stack, rules[j].left);

                printf("$%s\t", stack);

                for (int k = i; k < strlen(input); k++)
                {
                    printf("%c", input[k]);
                }

                printf("$\t Reduce %s -> %s\n", rules[j].left, rules[j].right);

                j = -1;
            }
        }

        if (strcmp(stack, rules[0].left) == 0 && i == strlen(input))
        {
            printf("\nAccepted");
            break;
        }

        if (i == strlen(input))
        {
            printf("\nNot Accepted");
            break;
        }
    }
    return 0;
}