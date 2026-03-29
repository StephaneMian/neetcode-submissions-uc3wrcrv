class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        result= [0]*len(temperatures)
        stack=[]
        for i,current in enumerate(temperatures):

            while stack and current>temperatures[stack[-1]]:
                prev=stack.pop()
                warmer=i-prev
                result[prev]=warmer
            stack.append(i)
        return result