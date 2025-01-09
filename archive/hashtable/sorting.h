//
// Created by edu on 17/01/24.
//

#ifndef HASHTABLE_C_SORTING_H
#define HASHTABLE_C_SORTING_H
#include <stdio.h>
#include <stdbool.h>

void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

void selectionSort(int arr[], int n)
{
    int i, j, min_idx;

    // One by one move boundary of unsorted subarray
    for (i = 0; i < n-1; i++)
    {
        // Find the minimum element in unsorted array
        min_idx = i;
        for (j = i+1; j < n; j++)
          if (arr[j] < arr[min_idx])
            min_idx = j;

        // Swap the found minimum element with the first element
           if(min_idx != i)
            swap(&arr[min_idx], &arr[i]);
    }
}

void bobleSort(int list[], int count)
{
    bool swapped = false;
    do{
        bool swapped = false;
        for (int i = 0; i < count-1; i++)
        {
            if (list[i] > list[i+1])
            {
                swap(&list[i], &list[i+1]);
                swapped=true;
            }
        }
    } while (swapped);

}

void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}
#endif//HASHTABLE_C_SORTING_H
