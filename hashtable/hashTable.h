#ifndef HASHTABLE_C_HASHTABLE_H
#define HASHTABLE_C_HASHTABLE_H
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#define HASH_SIZE 100


struct node {
    char *key;
    char *value;
    struct node * next;
};

struct hash {
    struct node * list[HASH_SIZE];
};

typedef struct hash Hash;
typedef struct node Node;

static unsigned int hashCode(char *key)
{
    unsigned long hash = 5392;
    unsigned int c;
    while (c = *key++)
        hash = ((hash << 5) + hash) + c; //hash * 33 + c

    return hash % HASH_SIZE;
}

static struct node * createNode(char* key, char* value)
{
    struct node * newNode = (struct hash *) malloc(sizeof(struct node));
    newNode->key=key;
    newNode->value=value;
    return newNode;
}
void insertNode(Hash hash, char* key, char* value)
{
    unsigned int index = hashCode(key);
    struct node * current = hash.list[index];
    if(current == NULL)
        hash.list[index]= createNode(key, value);
    else
        while (current)
        {
            if(current->next == NULL)
            {
                current->next= createNode(key, value);
                break;
            }
            current = current->next;
        }
}
char* search(struct hash * hash, char* key)
{
    unsigned int index = hashCode(key); //hello > 64
    struct node * current = hash->list[index];
    while (current)
    {
        if (strcmp(current->key, key) == 0) return current->value;
        current = current->next;
    }
    return "";
}

void searchIndex(struct hash * hash, int index)
{
    struct node * current = hash->list[index];
    while (current)
    {
        printf("%s -> ", current->value);
        current = current->next;
    }
    printf("NULL\n");
}

#endif//HASHTABLE_C_HASHTABLE_H
