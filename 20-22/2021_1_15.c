#include <stdio.h>

// 2021년 1회 15번
// 실행 결과

struct good
{
    char name[10];
    int age;
};

void main()
{
    struct good s[] = {"Kim", 28, "Lee", 38, "Seo", 50, "Park", 35};
    struct good *p;
    p = s;
    p++;

    printf("%s\n", p->name);
    printf("%d\n", p->age);
}