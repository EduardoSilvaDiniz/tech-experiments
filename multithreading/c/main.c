#include <pthread.h>
#include <stdio.h>

int shared_variable = 0;

pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;

void *increment(void *arg) {
  for (int i = 0; i < 10000; i++) {
    pthread_mutex_lock(&mutex);
    shared_variable++;
    pthread_mutex_unlock(&mutex);
  }
  return NULL;
}

int main(int argc, char *argv[]) {
  pthread_t thread1, thread2, thread3, thread4;
  pthread_create(&thread1, NULL, increment, NULL);
  pthread_create(&thread2, NULL, increment, NULL);
  pthread_create(&thread3, NULL, increment, NULL);
  pthread_create(&thread4, NULL, increment, NULL);

  pthread_join(thread1, NULL);
  pthread_join(thread2, NULL);
  pthread_join(thread3, NULL);
  pthread_join(thread4, NULL);

  printf("shared_variable: %d\n ", shared_variable);
  pthread_mutex_destroy(&mutex);
  return 0;
}
