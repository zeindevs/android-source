cmake_minimum_required(VERSION 3.22)

project(mylib)

add_library(${PROJECT_NAME} SHARED mylib.cpp)

find_library(log-lib log)

target_link_libraries(${PROJECT_NAME} ${log-lib})
