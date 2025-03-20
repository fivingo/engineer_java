# 2022년 2회 13번
# 문자열 처리 및 포맷팅 | 실행 결과

a = "REMEMBER NOVEMBER"		# 변수 a 문자열로 초기화
b = a[:3] + a[12:16];		# 문자 인덱스 0~2, 12~15 | REMEMBE
c = "R AND %s" % "STR";		# 문자열 포맷팅 | %s에 % 값 대입

print(b + c)
