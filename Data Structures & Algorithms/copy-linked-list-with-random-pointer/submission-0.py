"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        
        dico={None:None}
        current=head
        while current:
            copy=Node(current.val)
            dico[current]=copy
            current=current.next
        
        current=head
        while current:
           copy=dico[current]
           copy.next=dico[current.next]
           copy.random=dico[current.random]
           current=current.next
        return dico[head]