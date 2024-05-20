#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#define MAX_DESCRIPTION_SIZE 100

typedef struct Task {
    int id;
    char description[MAX_DESCRIPTION_SIZE];
    struct Task* prox;
} TASK;

// CONSTRUCTOR
TASK* createTask(int id, char* description);
TASK* createTaskByScanf();

// QUEUE
void putToPendingQueue(TASK* newTask, TASK* GlobalQueue);
TASK* getFromPendingQueue(TASK* GlobalQueue);
void seeAllPendingQueue(TASK* GlobalQueue);

// LIST
void addToCompletedList(TASK* newTask,TASK* GlobalList);
TASK* removeFromCompletedListByItsId(int id,TASK* GlobalList);
void seeAllCompletedList(TASK* GlobalList);

// STACK
void pushToDraftStack(TASK* newTask, TASK* GlobalStack);
TASK* popFromDraftStack(TASK* GlobalStack);
void seeAllDraftStack(TASK* GlobalStack);

// MENU
void displayMenu();

int main() {
    int choice;
    TASK* GlobalQueue = malloc(sizeof(TASK));
    TASK* GlobalList  = malloc(sizeof(TASK));
    TASK* GlobalStack = malloc(sizeof(TASK));

    printf("################# TASK MANAGER SYSTEM #################");

    do {
        displayMenu();
        printf("Choose an option: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                // CREATE A TASK, THEN ADD TO PENDING QUEUE
                TASK* newTask = createTaskByScanf();
                putToPendingQueue(newTask, GlobalQueue);
                break;

            case 2:
                // SEE ALL TASKS FROM PENDING QUEUE
                seeAllPendingQueue(GlobalQueue);
                break;

            case 3:
                // COMPLETE FIRST PENDING TASK
                TASK* firstTask = getFromPendingQueue(GlobalQueue);
                if(firstTask != NULL) {
                    addToCompletedList(firstTask,GlobalList);
                }
                break;

            case 4:
                // SEE ALL TASKS FROM COMPLETED LIST
                seeAllCompletedList(GlobalList);
                break;

            case 5:
                // SET COMPLETED TASK TO DRAFT
                int id;
                printf("Enter Task ID (number): ");
                scanf("%d", &id);

                TASK* task = removeFromCompletedListByItsId(id, GlobalList);
                if(task != NULL) {
                    pushToDraftStack(task, GlobalStack);
                }
                break;

            case 6:
                // SEE ALL TASKS FROM DRAFT STACK
                seeAllDraftStack(GlobalStack);
                break;

            case 7:
                // SET LAST DRAFT AS PENDING TASK
                TASK* lastTask = popFromDraftStack(GlobalStack);
                if(lastTask != NULL) {
                    putToPendingQueue(task, GlobalQueue);
                }
                break;

            case 0:
                printf("Exiting program\n");
                break;
            default:
                printf("Invalid choice\n");
                break;
        }
    } while (choice != 0);

    printf("################# SYSTEM SHUT DOWN #################\n");
}

// CONSTRUCTOR
TASK* createTask(int id, char* description) {
    TASK* newTask = (TASK*) malloc(sizeof(TASK));

    newTask->id = id;
    strcpy(newTask->description, description);
    newTask->prox = NULL;

    return newTask;
}

TASK* createTaskByScanf() {
    int id;
    char description[MAX_DESCRIPTION_SIZE];

    printf("Enter Task ID (number): ");
    scanf("%d", &id);

    getchar();
    printf("Enter Task Description (string): ");

    fgets(description, MAX_DESCRIPTION_SIZE, stdin);
    description[strcspn(description, "\n")] = '\0';

    return createTask(id, description);
}

// QUEUE ----------------------------------
// 1
void putToPendingQueue(TASK* newTask, TASK* GlobalQueue) {
    printf("\nPutting Task to Pending Queue\n");
    TASK* swap = GlobalQueue;
    while (swap->prox != NULL)
      swap = swap->prox;
    swap->prox=newTask;
}

// 2
// TODO quando recebe uma task da stack, entra em loop pois não acha o prox NULL
void seeAllPendingQueue(TASK* GlobalQueue) {
    printf("\nPrinting All Pending Queue\nHEAD -> ");
    TASK* swap = GlobalQueue;
    while (swap->prox != NULL) {
      swap = swap->prox;
      printf("id: %d description: %s -> ", swap->id, swap->description);
    }
    printf("NULL \n");
}

// 3
TASK* getFromPendingQueue(TASK* GlobalQueue) {
    printf("\nGetting Task from Pending Queue\n");
    TASK* swap = GlobalQueue;

    if (swap->prox == NULL) {
      return NULL; // Return NULL if Queue is empty
    }

    TASK* returnSwap = swap->prox;
    swap->prox = swap->prox->prox;
    returnSwap->prox = NULL;
    return returnSwap;
}

// LIST -----------------------------------
//
// 4
void seeAllCompletedList(TASK* GlobalList) {
    printf("\nPrinting All Completed List\nHEAD -> ");
    TASK* swap = GlobalList;
    while (swap->prox != NULL) {
      swap = swap->prox;
      printf("id: %d description: %s -> ", swap->id, swap->description);
    }
    printf("NULL \n");
}

// 5
TASK* removeFromCompletedListByItsId(int id,TASK* GlobalList) {
    printf("\nRemoving Task from Completed List\n");
    TASK* swap = GlobalList;
    while (swap->prox != NULL) {
      if (swap->prox->id == id) {
        printf("%d", swap->prox->id);
        TASK* returnSwap = swap->prox;
        swap->prox = swap->prox->prox;
        returnSwap->prox = NULL;
        return returnSwap;
      }
      swap = swap->prox;
    }
    return NULL; // Return NULL if ID not exist
}

// 3
void addToCompletedList(TASK* newTask,TASK* GlobalList) {
    printf("\nAdding Task to Completed List\n");
    TASK* swap = GlobalList;
    while (swap->prox != NULL) {
      swap = swap->prox;
    }
    swap->prox = newTask;
}

// STACK -----------------------------------
// 5
void pushToDraftStack(TASK* newTask,TASK* GlobalStack) {

    printf("\nPushing Task to Draft Stack\n");
    TASK* swap = GlobalStack;
    while (swap->prox != NULL) {
      swap = swap->prox;
    }
    swap->prox = newTask;
}

// 6
void seeAllDraftStack(TASK* GlobalStack) {
    printf("\nPrinting All Draft Stack\nHEAD -> ");
    TASK* swap = GlobalStack;
    while (swap->prox != NULL) {
      swap = swap->prox;
      printf("id: %d description: %s -> ", swap->id, swap->description);
    }
    printf("NULL \n");
}

// 7
// TODO não esta removendo da var globalstack
TASK* popFromDraftStack(TASK* GlobalStack) {
    printf("\nPopping Task to Draft Stack\n");
    if(GlobalStack->prox == NULL)
      return NULL; // Return NULL if Stack is empty
              
    TASK* swap = GlobalStack;
    while (swap->prox->prox != NULL) {
      swap = swap->prox;
    }
    printf("%d", swap->prox->id);

    TASK* returnSwap = swap->prox;
    swap->prox = NULL;
    return returnSwap;
}

// MENU
void displayMenu() {
    printf("\nMenu:\n");
    printf("1 - Create New Pending Task\n");
    printf("2 - See All Pending Tasks\n");
    printf("3 - Complete First Pending Task\n");
    printf("4 - See All Completed Tasks\n");
    printf("5 - Set Completed Task as Draft by its ID\n");
    printf("6 - See All Draft Tasks\n");
    printf("7 - Set Last Draft Task as Pending Task\n");
    printf("0 - Exit\n");
}
