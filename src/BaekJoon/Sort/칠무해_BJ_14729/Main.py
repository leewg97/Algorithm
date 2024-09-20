import sys
import heapq

n = int(sys.stdin.readline().strip())
result = []
for i in range(n):
    grade = float(sys.stdin.readline().strip())
    heapq.heappush(result, grade)

for i in range(7):
    print('{:.3f}'.format(heapq.heappop(result)))
