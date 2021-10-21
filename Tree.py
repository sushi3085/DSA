class Node:
    def __init__(val = -2147483648, next = None):
        self.val = val
        self.next = next

class Tree:
    def __init__(root = None):
        if type(root)==list:
            self.generate(root)
            return
        self.root = root
    
    def generate(root):
        if not root:
            return

        self.root = None
        waitingList = []
        waitingList.append(root.pop(0))

        while waitingList:
            
    # insert levelorder
    def 