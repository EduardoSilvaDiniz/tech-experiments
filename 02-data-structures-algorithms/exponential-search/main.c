#include "exponential_search.h"
#include <stdio.h>

int main() {
  int list[LIST_SIZE] = {10, 12, 14, 16, 18, 20, 25, 30};
  int user_value = 0;

  show_list(list);

  while (user_value != -1) {
    printf("\nvalue to search (-1 to stop): ");
    scanf("%d", &user_value);

    garbage_collector();

    if (user_value == -1)
			return 0;

    printf("Index: %d\n", exponential_search(list, LIST_SIZE, user_value));
  }
  return 0;
}

