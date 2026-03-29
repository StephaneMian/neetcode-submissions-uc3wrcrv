class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dico={}
        for i,num in enumerate(nums):
            test=target-num
            if test in dico:
                return [dico.get(test),i]
            dico[num]=i
        return None
                