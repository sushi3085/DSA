def maximum_difference(nums):
    small = nums[0]
    large = nums[0]
    answer = 0
    for i in nums:
        if i > large:
            large = i
        else:
            small = min(small, i)
            large = i
        answer = max(answer, large-small)
    return answer if answer!=0 else -1
    """
    answer = 0
    mn = nums[0]
    for i in nums:
        answer = max(answer, mn-i)
        mn = min(mn, i)
    return answer if answer!=0 else -1
    """