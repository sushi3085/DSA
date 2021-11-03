def sumNumbers(self, root: Optional[TreeNode]) -> int:
	def DFS(root, pathSum):
		pathSum = pathSum*10 + root.val
		if not root.left and not root.right:
			self.answer += pathSum
		
		if root.left:
			DFS(root.left, pathSum)
		
		if root.right:
			DFS(root.right, pathSum)
		pathSum -= root.val
		pathSum /= 10
	#####
	self.answer = 0
	DFS(root, 0)
	return self.answer