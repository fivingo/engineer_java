# 2021년 1회 5번
# Shift Operator, 반복문 | 실행 결과

a = 100					# 변수 a 100으로 초기화
result = 0				# 변수 result 0으로 초기화

for i in range(1, 3):	# 반복문 | 범위 1부터 2까지
	result = a >> i		# 시프트 연산 | 오른쪽시프트 /2 왼쪽시프트 *2 i회, 소수는 버림
	result = result + 1

print(result)dd
