#include <stdio.h>

// 2022년 1회 19번
// 괄호 채우기

int main()
{
    int number = 1234;
    int div = 10;
    int result = 0;

//  while (number ( 1 ) 0)
//  {
//      result = result * div;
//      result = result + number ( 2 ) div;
//      number = number ( 3 ) div;
//  }
    while (number > 0)
    {
        result = result * div;
        result = result + number % div;
        number = number / div;
    }

    printf("%d", result);

    return 0;
}

// 결과 : 4321