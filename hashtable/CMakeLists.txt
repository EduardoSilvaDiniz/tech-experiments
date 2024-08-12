cmake_minimum_required(VERSION 3.27)
project(hashtable_C C)

set(CMAKE_C_STANDARD 23)

add_executable(hashtable_C main.c
        sorting.h
        hashTable.h
        exemple.c
        test.c)
