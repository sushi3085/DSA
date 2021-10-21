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
    
    # insert levelorder
    def generate(datas:list):
        if not datas:
            return

        self.root = Node(datas.pop(0))
        cur_root = None
        waitingRoots = [root]

        while waitingList:
            cur_root = waitingRoots.pop(0)
            
            if len(datas):
                cur_root.left = Node(datas.pop(0))
            if len(datas):
                cur_root.right = Node(datas.pop(0))
            
            waitingRoots.append(cur_root.left)
            waitingRoots.append(cur_root.right)
    
    def print():
        if not self.root:
            print("None")
            return
        result = [self.root]
        while result:
            cur_root = result.pop(0)
            if cur_root:
                print(cur.val, sep=" -> ")
                result.append(cur.left)
                result.append(cur.right)
            else:
                continue
        print("None")


if __name__ == "__main__":
    tree = Tree([1,2,3,4,5,6,7])
    tree.print()