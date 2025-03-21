# 2021년 1회 5번
# list, 반복문 | 실행 결과

class good:			# 리스트 정의
	li = ["seoul", "kyeonggi", "incheon", "daejeon", "daegu", "pusan"]

g = good()			# 인스턴스(객체) 생성
str01 = ''			# 빈 문자열로 초기화

for i in g.li:		# 반복문
	str01 = str01 + i[0]	# 각 요소의 첫 번째 문자 추가

print(str01)
