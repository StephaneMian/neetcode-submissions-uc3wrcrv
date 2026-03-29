class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n=len(prices)
        b,s=0,1
        maxP=0
        while s<n:
            profit= prices[s]-prices[b]
            if profit>0:
                maxP=max(maxP,profit)
            else:
                b=s
            s+=1
        return maxP