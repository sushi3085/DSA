def longest_p_string(string):
	size = len(string)
	table = [[0]*size for _ in range(size)]
	