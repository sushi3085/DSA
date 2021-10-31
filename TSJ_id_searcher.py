def searcher():
	for j in range(10):
		for k in range(10):
			if (6*j + 5*k)%10 == 3:
				print(f"M12{j}{k}06131")
				count += 1
	print("total count is:",count)

if __name__ == "__main__":
	searcher()