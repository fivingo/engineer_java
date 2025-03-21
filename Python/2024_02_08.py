# 2024년 2회 8번
# 함수 정의, 문자열 처리, 반복문, f-string 포맷팅 | 실행 결과

def cnt(str, p):				# 함수 cnt 정의
	result = 0					# 변수 result 0으로 초기화

	for i in range(len(str)):	# 반복문 | str 문자열의 길이만큼 반복
		sub = str[i:i + len(p)]	# 인덱스 i부터 인덱스 i + p의 길이만큼의 전 인덱스까지 잘라서 저장

		if sub == p:			# 잘라낸 값이 p와 같다면 result가 1씩 증가
			result += 1

	return result				# result 값 반환

str = "abdcabcabca"
p1 = "ca"
p2 = "ab"

print(cnt(str, p1))
print(cnt(str, p2))

print(f'ab{cnt(str, p1)} ca{cnt(str, p2)}')
# f-string | 문자열 포맷팅, 변수나 표현식을 직접 포함할 수 있게함
# f'문자열 {변수, 표현식}'
