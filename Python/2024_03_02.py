# 2024년 3회 2번
# list, 함수 정의, 반복문, sum 함수 | 실행 결과

def test(lst):  					# 함수 test 정의
	for i in range(len(lst) // 2):  # 반복문 | // 정수 나눗셈 (소수점 버림)
		lst[i], lst[-i - 1] = lst[-i - 1], lst[i]	# 교환

ls = [1, 2, 3, 4, 5, 6]

test(ls)

print(sum(ls[::2]) - sum(ls[1::2]))
# sum(iterable) | 합계
# slice | 문자열 일부 추출
# [start : end : step] | step만큼 문자를 건너뛰면서 start 오프셋부터
#						(end - 1) 오프셋까지 시퀀스를 추출
# [::2] | 처음(0)부터 2만큼 건너뛰면서 끝까지 추출
# [1::2] | 1부터 2만큼 2만큼 건너뛰면서 끝까지 추출
