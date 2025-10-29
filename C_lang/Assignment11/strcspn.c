#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "Aditya,Durgude";
    printf("%lu",strcspn(str,"D"));
}
