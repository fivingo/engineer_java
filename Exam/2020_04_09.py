# 2020년 4회 9번
# list, 반복문 | 실행 결과

lol = [[1, 2, 3], [4, 5], [6, 7, 8, 9]]	# 리스트 생성

print(lol[0])				# 요소 출력

print(lol[2][1])			# 요소 출력

for sub in lol:				# 반복문
	for item in sub:		# 반복문
		print(item, end='')	# 개행 없이 요소 출력
	print()					# 개행
