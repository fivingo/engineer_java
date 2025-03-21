# 2024년 3회 2번
# 함수 정의, if-elif문, 변수 타입 | 실행 결과

def test(v):					# 함수 test 정의 | 타입 비교
	if type(v) == type(""):		# str | 문자열
		return len(v)			# 문자열이면 길이 반환
	elif type(v) == type(100):	# int | 정수
		return 101
	else:						# 그 외
		return 20

a = "100.0"						# str | 문자열
b = 100.0						# float | 실수
c = (100.0, 200.0)				# tuple | 튜플

print(test(a) + test(b) + test(c))
