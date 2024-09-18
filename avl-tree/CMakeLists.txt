cmake_minimum_required(VERSION 3.13) # CMake version check

project(binary-tree) # Create project "simple_example"

include_directories(${PROJECT_SOURCE_DIR}/include)

file(GLOB_RECURSE SOURCES "include/*.cpp")

list(APPEND SOURCES "./main.cpp")

add_executable(avl-tree ${SOURCES})
