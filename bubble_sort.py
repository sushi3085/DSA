def bubble_sort(arr):
	size = len(arr)
	index = 0
	flag = True
	while flag:
		flag = False
		while index<size-1:
			if arr[index]>arr[index+1]:
				arr[index], arr[index+1] = arr[index+1], arr[index]
				flag = True
			index += 1
		while index > 0:
			if arr[index] < arr[index-1]:
				arr[index], arr[index-1] = arr[index-1], arr[index]
				flag = True
			index -= 1
# three layer of while loop

if __name__ == "__main__":
	answer = [1,5,6,7,4,2,3,9,10,8]
	answer = bubble_sort()