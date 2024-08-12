#include <stdio.h>
#include <string.h>

char table[3][3] = {'0','0','0', // declaração da tabela
                    '0','0','0',
                    '0','0','0'};
char playerOne, playerTwo;

void ia(int op[]) // algoritmo que se baseia na escolha do jogador
{
   int play = 1;
   while (play == 1)
   {
       if (table[op[0] - 1][op[1]] == '0')
       {
           table[op[0] - 1][op[1]] = 'A';
           play = 0;
       }
       else if (table[op[0] + 1][op[1]] == '0')
       {
           table[op[0] + 1][op[1]] = 'A';
           play = 0;
       }
       else if (table[op[0]][op[1]-1] == '0')
       {
           table[op[0]][op[1]-1] = 'A';
           play = 0;
       }
       else if (table[op[0]][op[1]+1] == '0')
       {
           table[op[0]][op[1]+1] = 'A';
           play = 0;
       }
       else // caso o algoritmo não ache uma posição, ela verifica uma por uma ate acha uma livre
       {
           for (int i = 0; i < 3; i++)
           {
               for (int j = 0; j < 3; j++)
               {
                   if (table[i][j] == '0')
                   {
                       table[i][j] = 'A';
                       play = 0;
                       break;
                   }
               }
           }
       }
   }
}
int searchWin(char playerOne, char playerSeg, int game) // verifica se o jogador ou a IA conseguiu completar as lacunas com X ou A
{
    char player[10];
    int i = 0;
    char icon = playerOne;
    strcpy(player, "Jogador 1"); // usei strcpy para diminuir o codigo

    while (i < 2)
    {
        if (table[0][0] == icon && table[0][1] == icon && table[0][2] == icon)
        {
            printf("%s Ganhou!!\n", player);
            return 0;
        }
        else if (table[0][0] == icon && table[1][0] == icon && table[2][0] == icon)
        {
            printf("%s Ganhou!!\n", player);
            return 0;
        }
        else if (table[0][2] == icon && table[1][2] == icon && table[2][2] == icon)
        {
            printf("%s Ganhou!!\n", player);
            return 0;
        }
        else if (table[2][0] == icon && table[2][1] == icon && table[2][2] == icon)
        {
            printf("%s Ganhou!!\n", player);
            return 0;
        }
        else if (table[0][0] == icon && table[1][1] == icon && table[2][2] == icon)
        {
            printf("%s Ganhou!!\n", player);
            return 0;
        }
        else if (table[0][2] == icon && table[1][1] == icon && table[2][0] == icon)
        {
            printf("%s Ganhou!!\n", player);
            return 0;
        }
        else if (table[1][0] == icon && table[1][1] == icon && table[1][2] == icon)
        {
            printf("%s Ganhou!!\n", player);
            return 0;
        }
        else if (table[0][1] == icon && table[1][1] == icon && table[2][1] == icon)
        {
            printf("%s Ganhou!!\n", player);
            return 0;
        }
        icon = playerSeg;
        strcpy(player, "Jogador 2");
        i++;
    }
    return game;
}

void showTable() // mostra a tabela
{
    int l = 1;
    printf("    1   2   3\n");
    for (int i = 0; i < 3; i++)
    {
        printf("%i ", l);
        for (int j = 0; j < 3; j++)
        {
            printf("|");
            printf(" %c ", table[i][j]);
        }
        printf("|");
        printf("\n---------------");
        printf("\n");
        l++;
    }
}

void player(char icon, int game)
{
    int op[2]; // variavel que recebe a linha e coluna do player

    while (1 == 1) // loop infinito ate o jogador conseguir jogar
    {
        char player[10];
        switch (icon)
        {
            case 'X':
                strcpy(player, "Jogador 1");
                break;
            case 'O':
                strcpy(player, "Jogador 2");
                break;
        }

        printf("%s Digite a linha e coluna : ", player);
        scanf("%i%i", &op[0], &op[1]);

        op[0]=op[0]-1; // subtrai 1 para evitar erros
        op[1]=op[1]-1;

        if(table[op[0]][op[1]] == '0')
        {
            table[op[0]][op[1]] = icon;
            if(game == 1) // caso o player esteja jogando single player, a IA vai jogar
               ia(op); // simples algoritmo para jogar contra o jogador
            break;
        }
        else
            printf("esta posicao esta ocupada!\n");
    }
}

void iconPlayer()
{
    int op;
    printf("Jogador 1, Escolha o seu simbolo\n1. simbolo X\n2. simbolo O\nescolha uma opcao: ");
    scanf("%i", &op);
    if (op == 1)
    {
        playerOne = 'X';
        playerTwo = 'O';
    }
    else if (op == 2)
    {
        playerOne = 'O';
        playerTwo = 'X';
    }
}

int menuMain() // menu principal do jogo
{
    char menu[] = {"     _                         _        __     __   _ _\n"
                   "    | | ___   __ _  ___     __| | __ _  \\ \\   / /__| | |__   __ _\n"
                   " _  | |/ _ \\ / _` |/ _ \\   / _` |/ _` |  \\ \\ / / _ \\ | '_ \\ / _` |\n"
                   "| |_| | (_) | (_| | (_) | | (_| | (_| |   \\ V /  __/ | | | | (_| |\n"
                   " \\___/ \\___/ \\__, |\\___/   \\__,_|\\__,_|    \\_/ \\___|_|_| |_|\\__,_|\n"
                   "             |___/\n"
                   "1. single player\n2. Duelo\n3. Exit"};
    int op;
    printf("%s\nescolha uma opcao: ", menu);
    scanf("%i", &op);
    if (op == 2)
        iconPlayer();
    return op;
}

int main()
{
    int game = menuMain(); // variavel que mantem o modo de jogo

    showTable(); // mostra a tabela no inicio

    while (game == 1) // modo de jogo single player, player vs IA
    {
        player('X', game); // player 1
        showTable(); // mostra a tabela

        if (searchWin('X', 'O', game) == 0)
            break;// verifica se alguem ganhou
    }



    while (game == 2)  // modo de jogo duelo, player vs player
    {
        player(playerOne, game); // player 1
        showTable(); // mostra a tabela
        if (searchWin(playerOne, playerTwo, game) == 0)
            break;// verifica se alguem ganhou

        player(playerTwo, game); // player 2
        showTable(); // mostra a tabela
        if (searchWin(playerOne, playerTwo, game) == 0)
            break;// verifica se alguem ganhou
    }

    return 0;
}
