# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        p=0
        current=head
        while current:
            p+=1
            current=current.next
        if n==p:
            return head.next
        prev=head
        for _ in range(p-n-1):
            prev=prev.next
        prev.next=prev.next.next
        return head

        
        