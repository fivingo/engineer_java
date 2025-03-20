# 2022년 3회 9번
# list 함수, map 함수, lambda 함수 | 실행 결과

TestList = [1, 2, 3, 4, 5]	# 리스트 생성
TestList = list(map(lambda num: num + 100, TestList))
# list([iterable]) | 리스트 생성
# map(function, iterable) | 함수를 적용한 결과를 새로운 iterator로 반환
# lambda [parameters]: expression | 익명 함수 : 함수를 정의하고 호출해서 표현식 반환

print(TestList)
