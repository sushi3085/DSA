def BinarySearch(array, val) -> "index":
	if not array:
		return
	
	array.sort()
	left = 0
	right = len(array)-1
	mid = (left+right)>>1
	
	while left<right:
		if array[mid]==val:
			break
		if array[mid] < val:
			left = mid+1
		if array[mid] > val:
			right = mid
		mid = (left+right)>>1
	
	return mid