# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        if not head or not head.next:
            return 
        #find the middle of the linked-list
        mid, end = head, head.next
        while end and end.next:
            mid=mid.next
            end=end.next.next
        second=mid.next
        mid.next=None

        #inversion de mid
        prev=None
        while second :
            old=second.next
            second.next=prev
            prev=second
            second=old
        #merge 
        l1,l2=head,prev
        while l2:
            t1=l1.next
            t2=l2.next
            l1.next=l2
            l2.next=t1
            l1=t1
            l2=t2
        return None
        


            

        