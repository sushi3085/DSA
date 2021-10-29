class Solution:
	def getRange(self, arr, target):
		left = 0
		right = len(arr)-1
		mid = (arr[left]+arr[right])>>1
		while left<right:
			if arr[mid]==target:
				break
			if arr[mid]<target:
				left = mid+1
			else:
				right = mid
			mid = (left+right)>>1
		upper, lower = mid, mid
		while arr[lower]==target:
			if lower<0:
				break
			lower-=1
		while arr[upper]==target:
			if upper>=len(arr):
				break
			upper+=1
		return [lower+1, upper-1]


# Test program 
arr = [1, 2, 2, 2, 2, 3, 4, 7, 8, 8] 
x = 2
print(Solution().getRange(arr, x))
# [1, 4]