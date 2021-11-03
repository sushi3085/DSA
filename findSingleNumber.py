def find_singal_number(arr):
	if not arr:
		return
	result = arr.pop(0)
	for i in arr:
		result ^= i
	return result